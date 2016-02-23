#!/bin/bash -x

set -o errexit    # abort script at first error

function testImage() {
  local tagname=$1
  local distribution=$2
  local removal=$3
  if [ "${removal}" = "true" ]; then
    parameter_removal="--rm"
  else
    parameter_removal=""
  fi
  docker run ${parameter_removal} blacklabelops/java:$tagname java -version
  if [ "${distribution}" = "jdk" ]; then
    docker run ${parameter_removal} blacklabelops/java:$tagname javac -version
  fi
  docker run ${parameter_removal} blacklabelops/java:$tagname which java
  docker run ${parameter_removal} blacklabelops/java:$tagname sh -c 'echo $JAVA_HOME'
}

testImage "$@"
