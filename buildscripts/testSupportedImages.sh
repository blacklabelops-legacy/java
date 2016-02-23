#!/bin/bash -x

set -o errexit    # abort script at first error

# Setting environment variables
readonly CUR_DIR=$(cd $(dirname ${BASH_SOURCE:-$0}); pwd)

printf '%b\n' ":: Reading release config...."
source $CUR_DIR/release.sh

# OpenJDK 8
source $CUR_DIR/testImage.sh openjdk8 jdk true
source $CUR_DIR/testImage.sh openjdk8.$OPENJDK_8_JAVA_UPDATE_VERSION.$OPENJDK_8_JAVA_BUILD_NUMBER jdk true
source $CUR_DIR/testImage.sh openjre8 jre true
source $CUR_DIR/testImage.sh openjre8.$OPENJDK_8_JAVA_UPDATE_VERSION.$OPENJDK_8_JAVA_BUILD_NUMBER jre true

# OpenJDK 7
source $CUR_DIR/testImage.sh openjdk7 jdk true
source $CUR_DIR/testImage.sh openjdk7.$OPENJDK_7_JAVA_UPDATE_VERSION.$OPENJDK_7_JAVA_BUILD_NUMBER jdk true
source $CUR_DIR/testImage.sh openjre7 jre true
source $CUR_DIR/testImage.sh openjre7.$OPENJDK_7_JAVA_UPDATE_VERSION.$OPENJDK_7_JAVA_BUILD_NUMBER jre true

# JDK 8
source $CUR_DIR/testImage.sh centos.jdk8 jdk true
source $CUR_DIR/testImage.sh centos.jdk8.$ORACLE_8_JAVA_UPDATE_VERSION.$ORACLE_8_JAVA_BUILD_NUMBER jdk true
source $CUR_DIR/testImage.sh jdk8 jdk true
source $CUR_DIR/testImage.sh jdk8.$ORACLE_8_JAVA_UPDATE_VERSION.$ORACLE_8_JAVA_BUILD_NUMBER jdk true

# JRE 8
source $CUR_DIR/testImage.sh centos.jre8 jre true
source $CUR_DIR/testImage.sh centos.jre8.$ORACLE_8_JAVA_UPDATE_VERSION.$ORACLE_8_JAVA_BUILD_NUMBER jre true
source $CUR_DIR/testImage.sh jre8 jre true
source $CUR_DIR/testImage.sh jre8.$ORACLE_8_JAVA_UPDATE_VERSION.$ORACLE_8_JAVA_BUILD_NUMBER jre true

# JDK 7
source $CUR_DIR/testImage.sh centos.jdk7 jdk true
source $CUR_DIR/testImage.sh centos.jdk7.$ORACLE_7_JAVA_UPDATE_VERSION.$ORACLE_7_JAVA_BUILD_NUMBER jdk true
source $CUR_DIR/testImage.sh jdk7 jdk true
source $CUR_DIR/testImage.sh jdk7.$ORACLE_7_JAVA_UPDATE_VERSION.$ORACLE_7_JAVA_BUILD_NUMBER jdk true

# JRE 7
source $CUR_DIR/testImage.sh centos.jre7 jre true
source $CUR_DIR/testImage.sh centos.jre7.$ORACLE_7_JAVA_UPDATE_VERSION.$ORACLE_7_JAVA_BUILD_NUMBER jre true
source $CUR_DIR/testImage.sh jre7 jre true
source $CUR_DIR/testImage.sh jre7.$ORACLE_7_JAVA_UPDATE_VERSION.$ORACLE_7_JAVA_BUILD_NUMBER jre true

# JDK 6
source $CUR_DIR/testImage.sh centos.jdk6 jdk true
source $CUR_DIR/testImage.sh centos.jdk6.$ORACLE_6_JAVA_UPDATE_VERSION.$ORACLE_6_JAVA_BUILD_NUMBER jdk true
source $CUR_DIR/testImage.sh jdk6 jdk true
source $CUR_DIR/testImage.sh jdk6.$ORACLE_6_JAVA_UPDATE_VERSION.$ORACLE_6_JAVA_BUILD_NUMBER jdk true
