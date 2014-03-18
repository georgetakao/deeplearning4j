---
title: 
layout: default
---

# running a worker node

Running deeplearning4j in distributed mode is accessible with the following code:


       java -cp "lib/*"   -Xmx5g -Xms5g -server -XX:+UseTLAB   -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:MaxTenuringThreshold=0 -XX:CMSInitiatingOccupancyFraction=60  -XX:+CMSParallelRemarkEnabled -XX:+CMSPermGenSweepingEnabled -XX:+CMSClassUnloadingEnabled org.deeplearning4j.iterativereduce.actor.multilayer.ActorNetworkRunnerApp -h train1 -t worker


Note the -h and -t command-line parameters at the end. The -h points at a zookeeper node where the configuration is stored, and the -t specifies a worker node.

Service discovery happens when deeplearning4j stores the configuration upon startup. [ActorNetworkRunner](../doc/deeplearning4j/iterativereduce/actor/multilayer/ActorNetworkRunner.html) runs and starts both a local worker node and a master that stores the configuration specified in the master.

The worker then picks this up from zookeeper, and akka actors on the worker will automatically join the cluster thanks to akka's gossip protocol.


## setting host of akka cluster

First, ensure that the host for akka is set properly. If you set the host to 0.0.0.0 or localhost when trying to cluster, external workers will not be able to resolve the IP.

You can fix this by setting up your hosts file with an "agreed upon host" via the following property:

        -Dakka.remote.netty.tcp.hostname=yourhostname

You can also include this in your code: 

        System.setProperty("akka.remote.netty.tcp.hostname","yourhostname");


You'll need to address the hosts file issue before initializing your ActorNetworkRunner. The worker then picks this up from zookeeper, just as above. [Akka actors](http://doc.akka.io/docs/akka/snapshot/general/actors.html) on the worker will automatically join the cluster thanks to akka's gossip protocol.