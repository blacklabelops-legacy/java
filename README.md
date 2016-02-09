# Dockerized Oracle Java Images

[![Circle CI](https://circleci.com/gh/blacklabelops/java/tree/master.svg?style=shield)](https://circleci.com/gh/blacklabelops/java/tree/master) [![Docker Stars](https://img.shields.io/docker/stars/blacklabelops/java.svg)](https://hub.docker.com/r/blacklabelops/java/) [![Docker Pulls](https://img.shields.io/docker/pulls/blacklabelops/java.svg)](https://hub.docker.com/r/blacklabelops/java/)

## Supported tags and respective Dockerfile links

| Java Version | Tag | Dockerfile | Size |
|-|-|-|-|
| Java JRE 8 | jre8, latest | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jre-8-oracle-alpine/Dockerfile) | [![blacklabelops/java-jre-8:alpine](https://badge.imagelayers.io/blacklabelops/java-jre-8:alpine.svg)](https://imagelayers.io/?images=blacklabelops/java-jre-8:alpine 'blacklabelops/java-jre-8:alpine') |
| Java JRE 7 | jre7 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jre-7-oracle-alpine/Dockerfile) | [![blacklabelops/java-jre-7:alpine](https://badge.imagelayers.io/blacklabelops/java-jre-7:alpine.svg)](https://imagelayers.io/?images=blacklabelops/java-jre-7:alpine 'blacklabelops/java-jre-7:alpine') |
| Java JDK 8 | jdk8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jdk-8-oracle-alpine/Dockerfile) | [![blacklabelops/java-jdk-8:alpine](https://badge.imagelayers.io/blacklabelops/java-jdk-8:alpine.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-8:alpine 'blacklabelops/java-jdk-8:alpine') |
| Java JDK 7 | jdk7 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jdk-7-oracle-alpine/Dockerfile) | [![blacklabelops/java-jdk-7:alpine](https://badge.imagelayers.io/blacklabelops/java-jdk-7:alpine.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-7:alpine 'blacklabelops/java-jdk-7:alpine') |
| Java JDK 6 | jdk6 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jdk-6-oracle-alpine/Dockerfile) | [![blacklabelops/java-jdk-6:alpine](https://badge.imagelayers.io/blacklabelops/java-jdk-6:alpine.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-6:alpine 'blacklabelops/java-jdk-6:alpine') |

## Supported CentOS Images

| Java Version | Tag | Dockerfile | Size |
|-|-|-|-|
| Java JRE 8 | centos.jre8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jre-8-oracle/Dockerfile) | [![blacklabelops/java-jre-8](https://badge.imagelayers.io/blacklabelops/java-jre-8.svg)](https://imagelayers.io/?images=blacklabelops/java-jre-8 'blacklabelops/java-jre-8') |
| Java JRE 7 | centos.jre7 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jre-7-oracle/Dockerfile) | [![blacklabelops/java-jre-7](https://badge.imagelayers.io/blacklabelops/java-jre-7.svg)](https://imagelayers.io/?images=blacklabelops/java-jre-7 'blacklabelops/java-jre-7') |
| Java JDK 8 | centos.jdk8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jdk-8-oracle/Dockerfile) | [![blacklabelops/java-jdk-8](https://badge.imagelayers.io/blacklabelops/java-jdk-8.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-8 'blacklabelops/java-jdk-8') |
| Java JDK 7 | centos.jdk7 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jdk-7-oracle/Dockerfile) | [![blacklabelops/java-jdk-7](https://badge.imagelayers.io/blacklabelops/java-jdk-7.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-7 'blacklabelops/java-jdk-7') |
| Java JDK 6 | centos.jdk6 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jdk-6-oracle/Dockerfile) | [![blacklabelops/java-jdk-6](https://badge.imagelayers.io/blacklabelops/java-jdk-6.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-6 'blacklabelops/java-jdk-6') |

# Make It Short

~~~~
$ docker run blacklabelops/java java -version
~~~~

> Will print the java version on console.

# Use Versions

Just add the respective tag to the image name!

Example: Java JDK 7

~~~~
$ docker run blacklabelops/java:jdk7 java -version
~~~~

> Will print the java version on console.

# How to Extend

Example Dockerfile:

~~~~
FROM blacklabelops/java
MAINTAINER Your Name <your@email.com>

RUN Install-Your-Tooling
~~~~

> Will use Java JRE 8 as your base image.

Need the JDK?

Example Dockerfile:

~~~~
FROM blacklabelops/java:jdk8
MAINTAINER Your Name <your@email.com>

RUN Install-Your-Tooling
~~~~

> Will use Java JDK 8 as your base image.

# Support

Leave a message and ask questions on Hipchat: [blacklabelops/hipchat](https://www.hipchat.com/geogBFvEM)

# Github

The Dockerfiles for the different Java versions are maintained in the respective folders.

Example:

Folder: java-jdk-8-oracle

Version: Java Development Kit (JDK) Version 8, VM implementation by Oracle

# Vagrant

Vagrant is fabulous tool for pulling and spinning up virtual machines like docker with containers. I can configure my development and test environment and simply pull it online. And so can you! Install Vagrant and Virtualbox and spin it up. Change into the project folder and build the project on the spot!

~~~~
$ vagrant up
$ vagrant ssh
[vagrant@localhost ~]$ cd /vagrant/java-jdk-8-oracle/
[vagrant@localhost ~]$ docker build -t blacklabelops/jdk8 .
~~~~

# References

* [Docker Homepage](https://www.docker.com/)
* [Docker Userguide](https://docs.docker.com/userguide/)
* [Oracle Java](https://java.com/de/download/)
* [Vagrant Homepage](https://www.vagrantup.com/)
* [Virtualbox Homepage](https://www.virtualbox.org/)
