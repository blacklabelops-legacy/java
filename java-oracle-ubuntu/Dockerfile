FROM blacklabelops/ubuntu:18.04

# build parameters
ARG JAVA_DISTRIBUTION=jdk
ARG JAVA_MAJOR_VERSION=8
ARG JAVA_UPDATE_VERSION=121
ARG JAVA_BUILD_NUMBER=13
ARG JAVA_HASH=e9e7ea248e2c4826b92b3f075a80e441
ARG BUILD_DATE=undefined

ENV JAVA_VERSION=1.${JAVA_MAJOR_VERSION}.0_${JAVA_UPDATE_VERSION}
ENV JAVA_HOME=/opt/java/${JAVA_DISTRIBUTION}${JAVA_VERSION}
ENV PATH=$PATH:$JAVA_HOME/bin

# install java
RUN apt-get update && \
    apt-get -y install wget && \
    export JAVA_TARBALL=${JAVA_DISTRIBUTION}-${JAVA_MAJOR_VERSION}u${JAVA_UPDATE_VERSION}-linux-x64.tar.gz && \
    if  [ -n "${JAVA_HASH}" ]; \
      then JAVA_HASH_EXTENTION='/'$JAVA_HASH'/' ; \
      else JAVA_HASH_EXTENTION= ; \
    fi && \
    wget --directory-prefix=/tmp \
         --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" \
         http://download.oracle.com/otn-pub/java/jdk/${JAVA_MAJOR_VERSION}u${JAVA_UPDATE_VERSION}-b${JAVA_BUILD_NUMBER}${JAVA_HASH_EXTENTION}/${JAVA_TARBALL} && \
    mkdir -p /opt/java && \
    tar -xzf /tmp/${JAVA_TARBALL} -C /opt/java/ && \
    if  [ "${JAVA_DISTRIBUTION}" = "server-jre" ]; \
      then mv /opt/java/jdk${JAVA_VERSION} ${JAVA_HOME} ; \
    fi && \
    ln -s ${JAVA_HOME}/bin/java /usr/bin/java && \
    apt-get -y autoremove  \
          wget && \
    apt-get autoclean && \
    rm -rf /tmp/* && rm -rf /var/log/*

LABEL com.blacklabelops.image.name.java="java-"${JAVA_DISTRIBUTION}"-base-image" \
      com.blacklabelops.application.name.java="java" \
      com.blacklabelops.application.version.java=${JAVA_DISTRIBUTION}${JAVA_MAJOR_VERSION}"-"${JAVA_UPDATE_VERSION}"-b"${JAVA_BUILD_NUMBER} \
      com.blacklabelops.application.name.glibc="glibc" \
      com.blacklabelops.application.version.glibc=${GLIBC_VERSION} \
      com.blacklabelops.image.builddate.java=${BUILD_DATE}
