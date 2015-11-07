# BlackLabelOps/Java

[![Circle CI](https://circleci.com/gh/blacklabelops/java/tree/master.svg?style=shield)](https://circleci.com/gh/blacklabelops/java/tree/master)

These are base containers for maintaining the Java Version.

Leave a message and ask questions on Hipchat: [blacklabelops/hipchat](https://www.hipchat.com/geogBFvEM)

The Dockerfiles for the different Java versions are maintained in the respective folders.

Example:

Folder: java-jdk-8-oracle

Version: Java Development Kit (JDK) Version 8, VM implementation by Oracle

## Docker Hub & Docker Registry

[![Docker Hub Info](http://dockeri.co/image/blacklabelops/java-jre-7)](https://registry.hub.docker.com/u/blacklabelops/java-jre-7)

[![](https://badge.imagelayers.io/blacklabelops/java-jre-7:latest.svg)](https://imagelayers.io/?images=blacklabelops/java-jre-7:latest 'Get your own badge on imagelayers.io')

[![Docker Hub Info](http://dockeri.co/image/blacklabelops/java-jre-8)](https://registry.hub.docker.com/u/blacklabelops/java-jre-8)

[![](https://badge.imagelayers.io/blacklabelops/java-jre-8:latest.svg)](https://imagelayers.io/?images=blacklabelops/java-jre-8:latest 'Get your own badge on imagelayers.io')

[![Docker Hub Info](http://dockeri.co/image/blacklabelops/java-jdk-6)](https://registry.hub.docker.com/u/blacklabelops/java-jdk-6)

[![](https://badge.imagelayers.io/blacklabelops/java-jdk-6:latest.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-6:latest 'Get your own badge on imagelayers.io')

[![Docker Hub Info](http://dockeri.co/image/blacklabelops/java-jdk-7)](https://registry.hub.docker.com/u/blacklabelops/java-jdk-7)

[![](https://badge.imagelayers.io/blacklabelops/java-jdk-7:latest.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-7:latest 'Get your own badge on imagelayers.io')

[![Docker Hub Info](http://dockeri.co/image/blacklabelops/java-jdk-8)](https://registry.hub.docker.com/u/blacklabelops/java-jdk-8)

[![](https://badge.imagelayers.io/blacklabelops/java-jdk-8:latest.svg)](https://imagelayers.io/?images=blacklabelops/java-jdk-8:latest 'Get your own badge on imagelayers.io')

## Vagrant

Vagrant is fabulous tool for pulling and spinning up virtual machines like docker with containers. I can configure my development and test environment and simply pull it online. And so can you! Install Vagrant and Virtualbox and spin it up. Change into the project folder and build the project on the spot!

~~~~
$ vagrant up
$ vagrant ssh
[vagrant@localhost ~]$ cd /vagrant/java-jdk-8-oracle/
[vagrant@localhost ~]$ docker build -t="blacklabelops/jdk8" .
~~~~

## References

* [Docker Homepage](https://www.docker.com/)
* [Docker Userguide](https://docs.docker.com/userguide/)
* [Oracle Java](https://java.com/de/download/)
* [Vagrant Homepage](https://www.vagrantup.com/)
* [Virtualbox Homepage](https://www.virtualbox.org/)
