FROM blacklabelops/centos:7.2.1511
MAINTAINER Steffen Bleul <sbl@blacklabelops.com>

# install dev tools
RUN yum install -y \
    tar \
    wget && \
    yum clean all && rm -rf /var/cache/yum/*

COPY www.oracle.com.crt /etc/pki/ca-trust/source/anchors/

# envs for maintaining java updates
ENV JAVA_MAJOR_VERSION=6 \
    JAVA_UPDATE_VERSION=45 \
    JAVA_BUILD_NUMER=06
ENV JAVA_VERSION=1.${JAVA_MAJOR_VERSION}.0_${JAVA_UPDATE_VERSION}
ENV JAVA_HOME=/opt/java/jdk${JAVA_VERSION}
ENV PATH=$PATH:$JAVA_HOME/bin

# install java
RUN export JAVA_TARBALL=jdk-${JAVA_MAJOR_VERSION}u${JAVA_UPDATE_VERSION}-linux-x64.bin && \
    wget --directory-prefix=/tmp \
         --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" \
         http://download.oracle.com/otn-pub/java/jdk/${JAVA_MAJOR_VERSION}u${JAVA_UPDATE_VERSION}-b${JAVA_BUILD_NUMER}/${JAVA_TARBALL} && \
    mkdir -p /opt/java && \
    chmod +x /tmp/${JAVA_TARBALL} && \
    /tmp/${JAVA_TARBALL} && \
    mv jdk${JAVA_VERSION} /opt/java && \
    alternatives --install /usr/bin/java java /opt/java/jdk${JAVA_VERSION}/bin/java 100 && \
    rm -rf /tmp/* && rm -rf /var/log/*
