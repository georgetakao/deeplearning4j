---
layout: default
---

# Deeplearning4jとは何か?

Deeplearning4jはJavaを使った世界初のオープンソースdeep-learning　libraryになります。この技術は広範囲な情報調査というよりも、ビジネスフィールドでご活用いただけます。具体例としては、 [顔認識](../facial-reconstruction-tutorial.html), 音声認識, スパムメールの識別といった、複雑な情報に対して効果的に活用できます。

Deeplearning4jはGPUを利用し、実行されます。 **[詳しくはコチラ](http://nd4j.org/gpu_native_backends.html)** そして、多様性のある**[n-dimensional array](http://nd4j.org/)**を含んでおります。DL4J aims to be cutting-edge plug and play, more convention than configuration. By following its conventions, you get an [infinitely scalable](../scaleout.html) deep-learning architecture suitable for Hadoop and other big-data structures. This Java deep-learning library has a domain-specific language for neural networks that serves to turn their multiple knobs. 

Deeplearning4jは**distributed deep-learning framework** と通常のdeep-learning frameworkを活用しています。 (一つのスレッドで実行されることもあります。). DD4Jのトレーニングは大きな情報を含むクラスターの中でiterative　reduceというアルゴリズムを通じて行われます。JVMに対応する形で、Java,Scala,Clojureはすべて同様に利用することができます。

このオープンソースのdistributed deep-learning framework is made for data input and neural net training at scale, and its output should be highly accurate predictive models. 

By following the links at the bottom of each page, you will learn to set up, and train with sample data, several types of deep-learning networks. These include single- and multithread networks, [Restricted Boltzmann machines](../restrictedboltzmannmachine.html), [deep-belief networks](../deepbeliefnetwork.html), [Deep Autoencoders](http://deeplearning4j.org/deepautoencoder.html), [Recursive Neural Tensor Networks](http://deeplearning4j.org/recursiveneuraltensornetwork.html), [Convolutional Nets](http://deeplearning4j.org/convolutionalnets.html) and [Stacked Denoising Autoencoders](../stackeddenoisingautoencoder.html). 

For a quick introduction to neural nets, please see our [overview](../overview.html). In a nutshell, Deeplearning4j lets you compose deep nets from various shallow nets, each of which form a layer. This flexibility allows you to combine restricted Boltzmann machines, autoencoders, convolutional nets and recurrent nets as you prefer -- all in a distributed, production-grade framework.

There are a lot of knobs to turn when you're training a deep-learning network. We've done our best to explain them, so that Deeplearning4j can serve as a DIY tool for Java, Scala and Clojure programmers. If you have questions, please join [our Google Group](https://groups.google.com/forum/#!forum/deeplearning4j); for premium support, [contact us at Skymind](http://www.skymind.io/contact.html). [ND4J is the Java scientific computing engine](http://nd4j.org/) powering our matrix manipulations.

![Alt text](../img/logos_8.png)
