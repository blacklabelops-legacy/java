FROM blacklabelops/centos
MAINTAINER Steffen Bleul <sbl@blacklabelops.com>

# build parameters
ARG JAVA_DISTRIBUTION=jdk
ARG JAVA_MAJOR_VERSION=6
ARG JAVA_UPDATE_VERSION=45
ARG JAVA_BUILD_NUMBER=06

ENV JAVA_VERSION=1.${JAVA_MAJOR_VERSION}.0_${JAVA_UPDATE_VERSION}
ENV JAVA_HOME=/opt/java/${JAVA_DISTRIBUTION}${JAVA_VERSION}
ENV PATH=$PATH:$JAVA_HOME/bin

# install java
RUN yum install -y \
    tar \
    wget && \
    export JAVA_TARBALL=${JAVA_DISTRIBUTION}-${JAVA_MAJOR_VERSION}u${JAVA_UPDATE_VERSION}-linux-x64.bin && \
    wget --directory-prefix=/tmp \
         --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" \
         http://download.oracle.com/otn-pub/java/${JAVA_DISTRIBUTION}/${JAVA_MAJOR_VERSION}u${JAVA_UPDATE_VERSION}-b${JAVA_BUILD_NUMBER}/${JAVA_TARBALL} && \
    mkdir -p /opt/java && \
    chmod +x /tmp/${JAVA_TARBALL} && \
    /tmp/${JAVA_TARBALL} && \
    mv ${JAVA_DISTRIBUTION}${JAVA_VERSION} /opt/java && \
    alternatives --install /usr/bin/java java /opt/java/${JAVA_DISTRIBUTION}${JAVA_VERSION}/bin/java 100 && \
    yum erase -y \
        tar \
        wget && \
    yum clean all && rm -rf /var/cache/yum/* && rm -rf /tmp/* && rm -rf /var/log/*
