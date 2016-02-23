#!/bin/bash -x

set -o errexit    # abort script at first error

# Setting environment variables
readonly CUR_DIR=$(cd $(dirname ${BASH_SOURCE:-$0}); pwd)

printf '%b\n' ":: Reading release config...."
source $CUR_DIR/release.sh

source $CUR_DIR/testImage.sh centos.jdk6
source $CUR_DIR/testImage.sh centos.jdk6.$ORACLE_6_JAVA_MAJOR_VERSION.$ORACLE_6_JAVA_UPDATE_VERSION.$ORACLE_6_JAVA_BUILD_NUMBER
source $CUR_DIR/testImage.sh jdk6
source $CUR_DIR/testImage.sh jdk6.$ORACLE_6_JAVA_MAJOR_VERSION.$ORACLE_6_JAVA_UPDATE_VERSION.$ORACLE_6_JAVA_BUILD_NUMBER
