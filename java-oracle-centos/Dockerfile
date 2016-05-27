FROM blacklabelops/centos:7.2.1511
MAINTAINER Steffen Bleul <sbl@blacklabelops.com>

# build parameters
ARG JAVA_DISTRIBUTION=jdk
ARG JAVA_MAJOR_VERSION=8
ARG JAVA_UPDATE_VERSION=77
ARG JAVA_BUILD_NUMBER=03

ENV JAVA_VERSION=1.${JAVA_MAJOR_VERSION}.0_${JAVA_UPDATE_VERSION}
ENV JAVA_HOME=/opt/java/${JAVA_DISTRIBUTION}${JAVA_VERSION}
ENV PATH=$PATH:$JAVA_HOME/bin

# install java
RUN yum install -y \
      tar \
      which \
      wget && \
    export JAVA_TARBALL=${JAVA_DISTRIBUTION}-${JAVA_MAJOR_VERSION}u${JAVA_UPDATE_VERSION}-linux-x64.tar.gz && \
    wget --quiet --directory-prefix=/tmp \
         --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" \
         http://download.oracle.com/otn-pub/java/jdk/${JAVA_MAJOR_VERSION}u${JAVA_UPDATE_VERSION}-b${JAVA_BUILD_NUMBER}/${JAVA_TARBALL} && \
    mkdir -p /opt/java && \
    tar -xzf /tmp/${JAVA_TARBALL} -C /opt/java/ && \
    alternatives --install /usr/bin/java java /opt/java/${JAVA_DISTRIBUTION}${JAVA_VERSION}/bin/java 100 && \
    yum erase -y \
          tar \
          wget && \
    yum clean all && rm -rf /var/cache/yum/* && \
    rm -rf /tmp/* && rm -rf /var/log/*
