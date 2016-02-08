# BlackLabelOps/Java

[![Circle CI](https://circleci.com/gh/blacklabelops/java/tree/master.svg?style=shield)](https://circleci.com/gh/blacklabelops/java/tree/master)

These are base containers for maintaining the Java Version.

NEW: Reduced size Alpine Images!

Leave a message and ask questions on Hipchat: [blacklabelops/hipchat](https://www.hipchat.com/geogBFvEM)

# Docker Hub & Docker Registry

# Alpine Images

[blacklabelops/java-jre-8:alpine](https://hub.docker.com/r/blacklabelops/java-jre-8/)

* [![blacklabelops/java-jre-8:alpine](https://badge.imagelayers.io/blacklabelops/java-jre-8:alpine.svg)](https://imagelayers.io/?images=blacklabelops/java-jre-8:alpine 'blacklabelops/java-jre-8:alpine')

[blacklabelops/java-jdk-8:alpine](https://hub.docker.com/r/blacklabelops/java-jdk-8/)

* [![blacklabelops/java-jdk-8:alpine](https://badge.imagelayers.io/blacklabelops/java-jdk-8:alpine.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-8:alpine 'blacklabelops/java-jdk-8:alpine')

[blacklabelops/java-jre-7:alpine](https://hub.docker.com/r/blacklabelops/java-jre-7/)

* [![blacklabelops/java-jre-7:alpine](https://badge.imagelayers.io/blacklabelops/java-jre-7:alpine.svg)](https://imagelayers.io/?images=blacklabelops/java-jre-7:alpine 'blacklabelops/java-jre-7:alpine')

[blacklabelops/java-jdk-7:alpine](https://hub.docker.com/r/java-jdk-7/)

* [![java-jdk-7:alpine](https://badge.imagelayers.io/java-jdk-7:alpine.svg)](https://imagelayers.io/?images=java-jdk-7:alpine 'java-jdk-7:alpine')

[blacklabelops/java-jdk-6:alpine](https://hub.docker.com/r/java-jdk-6/)

* [![java-jdk-6:alpine](https://badge.imagelayers.io/java-jdk-6:alpine.svg)](https://imagelayers.io/?images=java-jdk-6:alpine 'java-jdk-6:alpine')

# CentOS Images

[blacklabelops/java-jre-8](https://hub.docker.com/r/blacklabelops/java-jre-8/)

* [![blacklabelops/java-jre-8](https://badge.imagelayers.io/blacklabelops/java-jre-8:latest.svg)](https://imagelayers.io/?images=blacklabelops/java-jre-8:latest 'blacklabelops/java-jre-8')

[blacklabelops/java-jdk-8](https://hub.docker.com/r/blacklabelops/java-jdk-8/)

* [![blacklabelops/java-jdk-8](https://badge.imagelayers.io/blacklabelops/java-jdk-8:latest.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-8:latest 'blacklabelops/java-jdk-8')

[blacklabelops/java-jre-7](https://hub.docker.com/r/blacklabelops/java-jre-7/)

* [![blacklabelops/java-jre-7](https://badge.imagelayers.io/blacklabelops/java-jre-7:latest.svg)](https://imagelayers.io/?images=blacklabelops/java-jre-7:latest 'blacklabelops/java-jre-7')

[blacklabelops/java-jdk-7](https://hub.docker.com/r/blacklabelops/java-jdk-7/)

* [![blacklabelops/java-jdk-7](https://badge.imagelayers.io/blacklabelops/java-jdk-7:latest.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-7:latest 'blacklabelops/java-jdk-7')

[blacklabelops/java-jdk-6](https://hub.docker.com/r/blacklabelops/java-jdk-6/)

* [![blacklabelops/java-jdk-6](https://badge.imagelayers.io/blacklabelops/java-jdk-6:latest.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-6:latest 'blacklabelops/java-jdk-6')

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
[vagrant@localhost ~]$ docker build -t="blacklabelops/jdk8" .
~~~~

# References

* [Docker Homepage](https://www.docker.com/)
* [Docker Userguide](https://docs.docker.com/userguide/)
* [Oracle Java](https://java.com/de/download/)
* [Vagrant Homepage](https://www.vagrantup.com/)
* [Virtualbox Homepage](https://www.virtualbox.org/)
