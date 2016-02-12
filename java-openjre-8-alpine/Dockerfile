FROM blacklabelops/alpine:3.3
MAINTAINER Steffen Bleul <sbl@blacklabelops.com>

RUN export JAVA_MAJOR_VERSION=8 && \
    export JAVA_MINOR_VERSION=66 && \
    export JAVA_BUILD_VERION=17-r2 && \
    export JAVA_VERSION=${JAVA_MAJOR_VERSION}.${JAVA_MINOR_VERSION}.${JAVA_BUILD_VERION} && \
    if  [ "${JAVA_MINOR_VERSION}" = "latest" ]; \
      then apk add --update openjdk${JAVA_MAJOR_VERSION}-jre ; \
      else apk add --update "openjdk${JAVA_MAJOR_VERSION}-jre=${JAVA_VERSION}" ; \
    fi && \
    # Clean caches and tmps
    rm -rf /var/cache/apk/* && \
    rm -rf /tmp/* && \
    rm -rf /var/log/*

ENV JAVA_HOME=/usr/lib/jvm/java-1.8-openjre
