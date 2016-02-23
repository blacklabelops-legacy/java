#!/bin/bash -x

set -o errexit    # abort script at first error

# Setting environment variables
readonly CUR_DIR=$(cd $(dirname ${BASH_SOURCE:-$0}); pwd)

printf '%b\n' ":: Reading release config...."
source $CUR_DIR/release.sh

readonly PUSH_REPOSITORY=$1

function retagImage() {
  local tagname=$1
  local repository=$2
  docker tag -f blacklabelops/jenkins:$tagname $repository/blacklabelops/jenkins:$tagname
}

function pushImage() {
  local tagname=$1
  local repository=$2
  if [ "$repository" != 'docker.io' ]; then
    retagImage $tagname $repository
  fi
  docker push $repository/blacklabelops/java:$tagname
}

pushImage latest $PUSH_REPOSITORY

# OpenJDK 8
pushImage openjdk8 $PUSH_REPOSITORY
pushImage openjdk8.$OPENJDK_8_JAVA_UPDATE_VERSION.$OPENJDK_8_JAVA_BUILD_NUMBER $PUSH_REPOSITORY
pushImage openjre8 $PUSH_REPOSITORY
pushImage openjre8.$OPENJDK_8_JAVA_UPDATE_VERSION.$OPENJDK_8_JAVA_BUILD_NUMBER $PUSH_REPOSITORY

# OpenJDK 7
pushImage openjdk7 $PUSH_REPOSITORY
pushImage openjdk7.$OPENJDK_7_JAVA_UPDATE_VERSION.$OPENJDK_7_JAVA_BUILD_NUMBER $PUSH_REPOSITORY
pushImage openjre7 $PUSH_REPOSITORY
pushImage openjre7.$OPENJDK_7_JAVA_UPDATE_VERSION.$OPENJDK_7_JAVA_BUILD_NUMBER $PUSH_REPOSITORY
