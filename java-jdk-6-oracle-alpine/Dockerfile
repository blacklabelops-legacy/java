FROM blacklabelops/alpine
MAINTAINER Steffen Bleul <sbl@blacklabelops.com>

# envs for maintaining java updates
ENV JAVA_MAJOR_VERSION=6 \
    JAVA_UPDATE_VERSION=45 \
    JAVA_BUILD_NUMER=06
ENV JAVA_VERSION=1.${JAVA_MAJOR_VERSION}.0_${JAVA_UPDATE_VERSION}
ENV JAVA_HOME=/opt/java/jdk${JAVA_VERSION}
ENV PATH=$PATH:$JAVA_HOME/bin

# install java
RUN export JAVA_TARBALL=jdk-${JAVA_MAJOR_VERSION}u${JAVA_UPDATE_VERSION}-linux-x64.bin && \
    # Install tooling
    apk add --update \
      ca-certificates \
      wget && \
    # Install latest glibc
    wget --directory-prefix=/tmp https://circle-artifacts.com/gh/andyshinn/alpine-pkg-glibc/6/artifacts/0/home/ubuntu/alpine-pkg-glibc/packages/x86_64/glibc-2.21-r2.apk && \
    apk add --allow-untrusted /tmp/glibc-2.21-r2.apk && \
    wget --directory-prefix=/tmp https://circle-artifacts.com/gh/andyshinn/alpine-pkg-glibc/6/artifacts/0/home/ubuntu/alpine-pkg-glibc/packages/x86_64/glibc-bin-2.21-r2.apk && \
    apk add --allow-untrusted /tmp/glibc-bin-2.21-r2.apk && \
    /usr/glibc/usr/bin/ldconfig /lib /usr/glibc/usr/lib && \
    # Install oracle java
    wget --directory-prefix=/tmp \
         --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" \
         http://download.oracle.com/otn-pub/java/jdk/${JAVA_MAJOR_VERSION}u${JAVA_UPDATE_VERSION}-b${JAVA_BUILD_NUMER}/${JAVA_TARBALL} && \
    mkdir -p /opt/java && \
    chmod +x /tmp/${JAVA_TARBALL} && \
    /tmp/${JAVA_TARBALL} && \
    mv jdk${JAVA_VERSION} /opt/java && \
    ln -s ${JAVA_HOME}/bin/java /usr/bin/java && \
    # Remove obsolete packages
    apk del \
    ca-certificates \
    wget && \
    # Clean caches and tmps
    rm -rf /var/cache/apk/* && \
    rm -rf /tmp/* && \
    rm -rf /var/log/*
