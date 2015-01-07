---
layout: default
---

# Getting Started

Contents

* <a href="#quickstart">Quickstart</a>
* <a href="#all">Deeplearning4j install (All OS)</a>
    * <a href="#ide-for-java">IDE</a>
    * <a href="#maven">Maven</a>
    * <a href="#github">Github</a>
    * <a href="#linux">Linux</a>
    * <a href="#osx">OSX</a>
    * <a href="#windows">Windows</a>
* <a href="#source">Working With Source</a>
* <a href="#eclipse">Eclipse</a>
* <a href="#trouble">Troubleshooting</a>
* <a href="#next">Next Steps</a>

## <a name="quickstart">Quickstart</a>

Our [Quickstart](../quickstart.html) shows you how to run your first examples. 

## <a name="all">Full Install: All OS</a>

DeepLearning4J requires [Java 7](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html) or above. For more complete instructions installing Java, see our Getting Started page for ND4J.

## ND4J: Numpy for the JVM

[ND4J is the Java scientific computing engine](http://nd4j.org/) powering our matrix manipulations.The ND4J getting started page is [here](http://nd4j.org/getstarted.html), and you need to install it to run DL4J. 

# <a id="ide-for-java">Integrated Development Environment</a>

### Integrated Development Environmentとは

Integrated Development Environment[[IDE]](http://encyclopedia.thefreedictionary.com/integrated+development+environment)とは、ソフトウェアの開発において用いられるエディタ、コンパイラ、リンカ、デバッガ、その他の支援ツールなどを統合・統一化した開発環境のことを指します。IDEには、ソフトウェア開発に必要な最低限のツールがすべて含まれているため、これを導入することで、インストールしたMaveとGitHubの操作を統一して行うことができます。 
### なぜIDEが必要か

IDSを活用することで、コードを入力するだけで簡単にシステムをセットアップができるようになります。IDEは一般的にMavenとセットで使われるため、Mavenのダウンロードをおすすめしております。

### イントール状況の確認

インストールプログラムをご確認ください。

### インストール方法

[intellij](https://www.jetbrains.com/idea/download/)のfree community editionをお勧めいたします。

以下のIDEも同様にご活用いただけます。

[Eclipse](http://books.sonatype.com/m2eclipse-book/reference/creating-sect-importing-projects.html) or [Netbeans](http://wiki.netbeans.org/MavenBestPractices).

インストール後、以下のサイトからND4Jプロジェクトをダウンロードいただけます。

[Intellijの場合](http://stackoverflow.com/questions/1051640/correct-way-to-add-lib-jar-to-an-intellij-idea-project)、
[Eclipseの場合](http://stackoverflow.com/questions/3280353/how-to-import-a-jar-in-eclipse) 、 [Netbeansの場合](http://gpraveenkumar.wordpress.com/2009/06/17/abc-to-import-a-jar-file-in-netbeans-6-5/)


# <a id="maven">Maven</a>

### Mavenとは
 MavenとはJava用プロジェクト管理ツールです。([Mavenホームページ](http://maven.apache.org/what-is-maven.html)) Mavenをインストールすることで、最新版のND4Jの[JAR](http://ja.wikipedia.org/wiki/JAR_%28%E3%83%95%E3%82%A1%E3%82%A4%E3%83%AB%E3%83%95%E3%82%A9%E3%83%BC%E3%83%9E%E3%83%83%E3%83%88%29)を自動的にアップロードし続けることができます。

### なぜ必要か
 Mavenを活用することで、より簡単にND4JとDeeplearning4j projectsをインストールすることができます。なお、最終的にダウンロードする[IDE](http://ja.wikipedia.org/wiki/%E7%B5%B1%E5%90%88%E9%96%8B%E7%99%BA%E7%92%B0%E5%A2%83)を操作するうえでも、Mavenは役立ちます。([IDE](https://github.com/globalcaos/nd4j/blob/gh-pages/getstarted.md#4-ide-for-java))また、もしMavenの内容をご理解いただいている方は、[当社ホームページ](http://nd4j.org/downloads.html) ページにアクセスいただくことで、この過程をスキップすることができます。

### イントール状況の確認
コマンドラインに、以下のコードをご入力ください。

		mvn --version

### インストール方法
[Mavenホームページ](https://maven.apache.org/download.cgi)を通じて、無料でダウンロードいただけます

![Alt text](../img/maven_downloads.png) 

ページの下部にある、お使いのOperating Systemごとの説明に沿って、インストールを進めてください。
 “Unix-based Operating Systems (Linux, Solaris and Mac OS X).”はこのような形で表示されております。
 
![Alt text](../img/maven_OS_instructions.png) 

ここまでの作業を完了すると、IDEを使って新しいプロジェクトを作ることができます。

![Alt text](../img/new_maven_project.png) 

IntelliJのWindowを通じて、下に表示されている画面が表示されます。まずはじめに名前を入力します。

![Alt text](../img/maven2.png) 

 "Next"を押していただくと、次のウィンドウが表示されますので、"ND4J"と名前を入力してください。
 これでIntelliJのpom.xml fileにアクセスでき、以下のよう表示されます。
 
 ![Alt text](../img/nd4j_pom_before.png) 
 
 
 次に<dependencies>セクションにdepemdencyを加えていく必要があります。これはCPUsやGPUsによって異なりますので、それぞれに適応する形で"nd4j-api"と a linear-algebra backend like "nd4j-jblas" か"nd4j-jcublas"を選択してください。これらはすべて <a href="http://search.maven.org/#search%7Cga%7C1%7Cnd4j-jblas">こちら</a>から取得できます。 "latest version" を選択し、コピーを行ってください。
 
 ![Alt text](../img/nd4j_maven.png)
 
 コピーした内容を<dependencies>セクションにペーストすると、以下の表示内容になります。
 
 ![Alt text](../img/nd4j_pom_after.png) 
 
 これで設定は完了になります。これ以降はIntelliJに新たなファイルを作ることも、 ND4Jの APIを利用することも可能になります。
 もし新たなアイデアが必要な場合には、[intro](http://nd4j.org/introduction.html)をご覧ください。

## <a id="github">Github</a>

* Github is **only necessary** to run DL4J examples from the Quickstart, or to help develop the framework by working on the source code. It is not necessary to install Deeplearning4j and use its neural nets, so if you do not plan to help us develop DL4J, you may not need it. In that case, proceed to the IDE. 
* Download Github for [Mac](https://mac.github.com/), [Windows](https://windows.github.com/), etc. Then enter this command into your terminal (Mac) or Git Shell (Windows):

      git clone https://github.com/SkymindIO/deeplearning4j

### <a name="linux">Linux</a>

* Due to our reliance on Jblas for CPUs, native bindings for Blas are required.

        Fedora/RHEL
        yum -y install blas

        Ubuntu
        apt-get install libblas* (credit to @sujitpal)

* If GPUs are broken, you'll need to enter an extra command. First, find out where Cuda installs itself. It will look something like this

         /usr/local/cuda/lib64

Then enter *ldconfig* in the terminal, followed by the file path to link Cuda. Your command will look similar to this

         ldconfig /usr/local/cuda/lib64

If you're still unable to load Jcublas, you will need to add the parameter -D to your code (it's a JVM argument):

         java.library.path (settable via -Djava.librarypath=...) 
         // ^ for a writable directory, then 
         -D appended directly to "<OTHER ARGS>" 

If you're using IntelliJ as your IDE, this should work already. 

### <a name="osx">OSX</a>

* Jblas is already installed on OSX.  

### <a name="windows">Windows</a>

* The [Maven download page](http://maven.apache.org/download.cgi) has extensive instructions on how to download both Maven and Java under the "Windows section." Proper configuration entails [setting certain environment variables](http://www.computerhope.com/issues/ch000549.htm). 

* Install [Anaconda](http://docs.continuum.io/anaconda/install.html#windows-install). If your system doesn't like the default 64-bit install, try the 32-bit offered on the same download page. (Deeplearning4j depends on Anaconda to use the graphics generator matplotlib.) 

* Install [Lapack](http://icl.cs.utk.edu/lapack-for-windows/lapack/). (Lapack will ask if you have Intel compilers. You do not.)

* To do so, you will need to install [MinGW 32 bits](http://www.mingw.org/) even if you have a 64-bit computer (the download button is on the upper right), and then download the [Prebuilt dynamic libraries using Mingw](http://icl.cs.utk.edu/lapack-for-windows/lapack/#libraries_mingw). 

* Lapack offers the alternative of [VS Studio Solution](http://icl.cs.utk.edu/lapack-for-windows/lapack/#lapacke). You'll also want to look at the documentation for [Basic Linear Algebra Subprograms (BLAS)](http://www.netlib.org/blas/). 

* *For DL4J developers:* Install [Github](https://windows.github.com/). Click on the Git Shell alias. Within that shell, enter the commands below to **git clone** the code repositories of ND4J and Deeplearning4j. 

      git clone https://github.com/SkymindIO/nd4j
      git clone https://github.com/SkymindIO/deeplearning4j

###<a name="source">Working With Source</a>

For a deeper dive, check out our [Github repo](https://github.com/SkymindIO/deeplearning4j/). If you want to develop for Deeplearning4j, install Github for [Mac](https://mac.github.com/) or [Windows](https://windows.github.com/). Then git clone the repository, and run this command for Maven:

      mvn clean install -DskipTests -Dmaven.javadoc.skip=true

###<a name="eclipse">Eclipse</a> 

After running a git clone, enter this command

      mvn eclipse:eclipse 
  
which will import the source and set everything up. 

### <a name="trouble">Troubleshooting</a>

* If you have installed DL4J in the past and now see the examples throwing errors, run a git clone on [ND4J](http://nd4j.org/getstarted.html) in the same root directory as DL4J; run a clean Maven install within ND4J; install DL4J again; run a clean Maven install within DL4J, and see if that fixes things.

* When you run an example, you may get a low [f1 score](../glossary.html#f1), which is the probability that the net's classification is accurate. In this case, a low f1 doesn't indicate poor performance, because the examples train on small data sets. We gave them small data sets so they would run quickly. Because small data sets are less representative than large ones, the results they produce will vary a great deal. For example, on the minuscule example data, our deep-belief net's f1 score currently varies between 0.32 and 1.0.

* Go here for a Javadoc list of [Deeplearning4j's classes and methods](http://deeplearning4j.org/doc/).

### <a name="next">Next Steps: MNIST and Running Examples</a>

Take a look at the [MNIST tutorial](../mnist-tutorial.html). If you have a clear idea of how deep learning works and know what you want it to do, go straight to our section on [custom datasets](../customdatasets.html). 
