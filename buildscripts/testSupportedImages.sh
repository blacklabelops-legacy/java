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

# JDK 6
source $CUR_DIR/testImage.sh centos.jdk6 jdk
source $CUR_DIR/testImage.sh centos.jdk6.$ORACLE_6_JAVA_UPDATE_VERSION.$ORACLE_6_JAVA_BUILD_NUMBER jdk
source $CUR_DIR/testImage.sh jdk6 jdk
source $CUR_DIR/testImage.sh jdk6.$ORACLE_6_JAVA_UPDATE_VERSION.$ORACLE_6_JAVA_BUILD_NUMBER jdk
