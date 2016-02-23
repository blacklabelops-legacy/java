#!/bin/bash -x

set -o errexit    # abort script at first error

# Setting environment variables
readonly CUR_DIR=$(cd $(dirname ${BASH_SOURCE:-$0}); pwd)

printf '%b\n' ":: Reading release config...."
source $CUR_DIR/release.sh

# JDK 8
source $CUR_DIR/testImage.sh centos.jdk8 jdk
source $CUR_DIR/testImage.sh centos.jdk8.$ORACLE_8_JAVA_UPDATE_VERSION.$ORACLE_8_JAVA_BUILD_NUMBER jdk
source $CUR_DIR/testImage.sh jdk8 jdk
source $CUR_DIR/testImage.sh jdk8.$ORACLE_8_JAVA_UPDATE_VERSION.$ORACLE_8_JAVA_BUILD_NUMBER jdk

# JRE 8
source $CUR_DIR/testImage.sh centos.jre8 jre
source $CUR_DIR/testImage.sh centos.jre8.$ORACLE_8_JAVA_UPDATE_VERSION.$ORACLE_8_JAVA_BUILD_NUMBER jre
source $CUR_DIR/testImage.sh jre8 jre
source $CUR_DIR/testImage.sh jre8.$ORACLE_8_JAVA_UPDATE_VERSION.$ORACLE_8_JAVA_BUILD_NUMBER jre

# JDK 7
source $CUR_DIR/testImage.sh centos.jdk7 jdk
source $CUR_DIR/testImage.sh centos.jdk7.$ORACLE_7_JAVA_UPDATE_VERSION.$ORACLE_7_JAVA_BUILD_NUMBER jdk
source $CUR_DIR/testImage.sh jdk7 jdk
source $CUR_DIR/testImage.sh jdk7.$ORACLE_7_JAVA_UPDATE_VERSION.$ORACLE_7_JAVA_BUILD_NUMBER jdk

# JRE 7
source $CUR_DIR/testImage.sh centos.jre7 jre
source $CUR_DIR/testImage.sh centos.jre7.$ORACLE_7_JAVA_UPDATE_VERSION.$ORACLE_7_JAVA_BUILD_NUMBER jre
source $CUR_DIR/testImage.sh jre7 jre
source $CUR_DIR/testImage.sh jre7.$ORACLE_7_JAVA_UPDATE_VERSION.$ORACLE_7_JAVA_BUILD_NUMBER jre

# JDK 6
source $CUR_DIR/testImage.sh centos.jdk6 jdk
source $CUR_DIR/testImage.sh centos.jdk6.$ORACLE_6_JAVA_UPDATE_VERSION.$ORACLE_6_JAVA_BUILD_NUMBER jdk
source $CUR_DIR/testImage.sh jdk6 jdk
source $CUR_DIR/testImage.sh jdk6.$ORACLE_6_JAVA_UPDATE_VERSION.$ORACLE_6_JAVA_BUILD_NUMBER jdk
