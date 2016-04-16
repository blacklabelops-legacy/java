# Dockerized Oracle Java Images

[![Circle CI](https://circleci.com/gh/blacklabelops/java/tree/master.svg?style=shield)](https://circleci.com/gh/blacklabelops/java/tree/master) [![Docker Stars](https://img.shields.io/docker/stars/blacklabelops/java.svg)](https://hub.docker.com/r/blacklabelops/java/) [![Docker Pulls](https://img.shields.io/docker/pulls/blacklabelops/java.svg)](https://hub.docker.com/r/blacklabelops/java/)

## Supported tags and respective Dockerfile links

| Java Version | Tag          | Dockerfile | Size |
|--------------|--------------|------------|------|
| Java JRE 8   | jre8, latest | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-alpine/Dockerfile) | [![blacklabelops/java:jre8](https://badge.imagelayers.io/blacklabelops/java:jre8.svg)](https://imagelayers.io/?images=blacklabelops/java:jre8 'blacklabelops/java:jre8') |
| Java JRE 7   | jre7         | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-alpine/Dockerfile) | [![blacklabelops/java:jre7](https://badge.imagelayers.io/blacklabelops/java:jre7.svg)](https://imagelayers.io/?images=blacklabelops/java:jre7 'blacklabelops/java:jre7') |
| Java JDK 8   | jdk8         | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-alpine/Dockerfile) | [![blacklabelops/java:jdk8](https://badge.imagelayers.io/blacklabelops/java:jdk8.svg)](https://imagelayers.io/?images=blacklabelops/java:jdk8 'blacklabelops/java:jdk8') |
| Java JDK 7   | jdk7         | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-alpine/Dockerfile) | [![blacklabelops/java:jdk7](https://badge.imagelayers.io/blacklabelops/java:jdk7.svg)](https://imagelayers.io/?images=blacklabelops/java:jdk7 'blacklabelops/java:jdk7') |
| Java JDK 6   | jdk6         | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-jdk-6-alpine/Dockerfile) | [![blacklabelops/java:jdk6](https://badge.imagelayers.io/blacklabelops/java:jdk6.svg)](https://imagelayers.io/?images=blacklabelops/java:jdk6 'blacklabelops/java:jdk6') |

## Supported CentOS Images

| Java Version | Tag | Dockerfile | Size |
|--------------|-----|------------|------|
| Java JRE 8 | centos.jre8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-centos/Dockerfile) | [![blacklabelops/java:centos.jre8](https://badge.imagelayers.io/blacklabelops/java:centos.jre8.svg)](https://imagelayers.io/?images=blacklabelops/java:centos.jre8 'blacklabelops/java:centos.jre8') |
| Java JRE 7 | centos.jre7 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-centos/Dockerfile) | [![blacklabelops/java:centos.jre7](https://badge.imagelayers.io/blacklabelops/java:centos.jre7.svg)](https://imagelayers.io/?images=blacklabelops/java:centos.jre7 'blacklabelops/java:centos.jre7') |
| Java JDK 8 | centos.jdk8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-centos/Dockerfile) | [![blacklabelops/java:centos.jdk8](https://badge.imagelayers.io/blacklabelops/java:centos.jdk8.svg)](https://imagelayers.io/?images=blacklabelops/java:centos.jdk8 'blacklabelops/java:centos.jdk8') |
| Java JDK 7 | centos.jdk7 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-centos/Dockerfile) | [![blacklabelops/java:centos.jdk7](https://badge.imagelayers.io/blacklabelops/java:centos.jdk7.svg)](https://imagelayers.io/?images=blacklabelops/java:centos.jdk7 'blacklabelops/java:centos.jdk7') |
| Java JDK 6 | centos.jdk6 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-centos/Dockerfile) | [![blacklabelops/java:centos.jdk6](https://badge.imagelayers.io/blacklabelops/java:centos.jdk6.svg)](https://imagelayers.io/?images=blacklabelops/java:centos.jdk6 'blacklabelops/java:centos.jdk6') |

## Supported OpenJDK Images

| Java Version | Tag | Dockerfile | Size |
|--------------|-----|------------|------|
| Java JRE 8 | openjre8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-openjdk/Dockerfile) | [![blacklabelops/java:openjre8](https://badge.imagelayers.io/blacklabelops/java:openjre8.svg)](https://imagelayers.io/?images=blacklabelops/java:openjre8 'blacklabelops/java:openjre8') |
| Java JRE 7 | openjre7 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-openjdk/Dockerfile) | [![blacklabelops/java:openjre7](https://badge.imagelayers.io/blacklabelops/java:openjre7.svg)](https://imagelayers.io/?images=blacklabelops/java:openjre7 'blacklabelops/java:openjre7') |
| Java JDK 8 | openjdk8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-openjdk/Dockerfile) | [![blacklabelops/java:openjdk8](https://badge.imagelayers.io/blacklabelops/java:openjdk8.svg)](https://imagelayers.io/?images=blacklabelops/java:openjdk8 'blacklabelops/java:openjdk8') |
| Java JDK 7 | openjdk7 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-openjdk/Dockerfile) | [![blacklabelops/java:openjdk7](https://badge.imagelayers.io/blacklabelops/java:openjdk7.svg)](https://imagelayers.io/?images=blacklabelops/java:openjdk7 'blacklabelops/java:openjdk7') |

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

# How-To Extend

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

# Build Image

Take a Dockerfile and build with the default arguments:

~~~~
$ docker build -t blacklabelops/java -f java-oracle-alpine/Dockerfile .
~~~~

Build a specific Oracle Version with the following build arguments:

* JAVA_DISTRIBUTION: jdk or jre (default: jdk)
* JAVA_MAJOR_VERSION: 7 or 8
* JAVA_UPDATE_VERSION: The minor version from any Oracle Java download page.
* JAVA_BUILD_NUMBER: The build number from any Oracle Java download page.

Example:

~~~~
$ docker build -t blacklabelops/java \
  --build-arg JAVA_DISTRIBUTION=jdk \
  --build-arg JAVA_MAJOR_VERSION=8 \
  --build-arg JAVA_UPDATE_VERSION=74 \
  --build-arg JAVA_BUILD_NUMBER=02 \
  -f java-oracle-alpine/Dockerfile .
~~~~

> Will build image containing Java JDK 8 in version 8.74.02.

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
