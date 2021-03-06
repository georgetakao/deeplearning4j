package org.deeplearning4j.scaleout.perform.text;

import org.deeplearning4j.berkeley.Counter;
import org.deeplearning4j.models.word2vec.VocabWord;
import org.deeplearning4j.models.word2vec.wordstore.VocabCache;
import org.deeplearning4j.models.word2vec.wordstore.inmemory.InMemoryLookupCache;
import org.deeplearning4j.scaleout.aggregator.JobAggregator;
import org.deeplearning4j.nn.conf.Configuration;
import org.deeplearning4j.scaleout.job.Job;

import java.util.HashSet;
import java.util.Set;

/**
 * Word count aggregator for a vocab cache
 *
 * @author Adam Gibson
 */
public class WordCountJobAggregator implements JobAggregator {
    private VocabCache vocabCache;
    public final static String MIN_WORD_FREQUENCY = "org.deepleaerning4j.scaleout.perform.text.minwordfrequency";
    private int minWordFrequency = 5;

    public WordCountJobAggregator() {
        this(new InMemoryLookupCache());
    }

    public WordCountJobAggregator(VocabCache vocabCache) {
        this.vocabCache = vocabCache;
    }

    @Override
    public void accumulate(Job job) {
        Counter<String> wordCounts = (Counter<String>) job.getResult();
        Set<String> seen = new HashSet<>();
        for(String word : wordCounts.keySet()) {
            vocabCache.incrementWordCount(word,(int) wordCounts.getCount(word));
            if(!seen.contains(word)) {
                vocabCache.incrementTotalDocCount();
                vocabCache.incrementDocCount(word,1);
            }

            VocabWord token = vocabCache.tokenFor(word);
            if(token == null) {
                token = new VocabWord(wordCounts.getCount(word),word);
                vocabCache.addToken(token);

            }
            else if(vocabCache.wordFrequency(word) >= minWordFrequency) {
                //add to the vocab if it was already a token and occurred >= min word frequency times
                VocabWord vocabWord = vocabCache.wordFor(word);
                if(vocabWord == null) {
                    vocabCache.putVocabWord(word);
                }

            }
        }

    }

    @Override
    public Job aggregate() {
        Job ret =  new Job("","");
        ret.setResult(vocabCache);
        return ret;
    }

    @Override
    public void init(Configuration conf) {
        minWordFrequency = conf.getInt(MIN_WORD_FREQUENCY,5);
    }
}
