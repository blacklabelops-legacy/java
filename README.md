# Dockerized Oracle Java Images

[![Docker Stars](https://img.shields.io/docker/stars/blacklabelops/java.svg)](https://hub.docker.com/r/blacklabelops/java/) [![Docker Pulls](https://img.shields.io/docker/pulls/blacklabelops/java.svg)](https://hub.docker.com/r/blacklabelops/java/)

## Supported tags and respective Dockerfile links

| Java Version | Tag          | Dockerfile |
|--------------|--------------|------------|
| Java JRE 8   | jre.8, latest | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-alpine/Dockerfile) |
| Java Server JRE 8   | server-jre.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-alpine/Dockerfile) |
| Java JDK 8   | jdk.8         | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-alpine/Dockerfile) |

## Supported CentOS Images

| Java Version | Tag | Dockerfile |
|--------------|-----|------------|
| Java JRE 8 | centos.jre.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-centos/Dockerfile) |
| Java Server JRE 8 | centos.server-jre.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-centos/Dockerfile) |
| Java JDK 8 | centos.jdk.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-centos/Dockerfile) |

## Supported Ubuntu Images

| Java Version | Tag | Dockerfile |
|--------------|-----|------------|
| Java JRE 8 | ubuntu.jre.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-ubuntu/Dockerfile) |
| Java Server JRE 8 | ubuntu.server-jre.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-ubuntu/Dockerfile) |
| Java JDK 8 | ubuntu.jdk.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-oracle-ubuntu/Dockerfile) |

## Supported OpenJDK Images

| Java Version | Tag | Dockerfile |
|--------------|-----|------------|
| Java JRE 8 | openjre.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-openjdk/Dockerfile) |
| Java JDK 8 | openjdk.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-openjdk/Dockerfile) |

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

* JAVA_DISTRIBUTION: jdk, jre, or server-jre (default: jdk)
* JAVA_MAJOR_VERSION: 7 or 8
* JAVA_UPDATE_VERSION: The minor version from any Oracle Java download page.
* JAVA_BUILD_NUMBER: The build number from any Oracle Java download page.
* JAVA_HASH: The hash from any Oracle Java download page.

Example:

~~~~
$ docker build -t blacklabelops/java \
  --build-arg JAVA_DISTRIBUTION=server-jre \
  --build-arg JAVA_MAJOR_VERSION=8 \
  --build-arg JAVA_UPDATE_VERSION=161 \
  --build-arg JAVA_BUILD_NUMBER=12 \
  --build-arg JAVA_HASH=2f38c3b165be4555a1fa6e98c45e0808 \
  -f java-oracle-alpine/Dockerfile .
~~~~

> Will build image containing Server JRE 8 in version 8.161.12.

> Note: It's only possible to download the Java versions available at http://www.oracle.com/technetwork/java/javase/downloads/index.html.
> (An Oracle account is necessary to download archived Java versions.)

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
