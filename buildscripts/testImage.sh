#!/bin/bash -x

set -o errexit    # abort script at first error

function testImage() {
  local tagname=$1
  local distribution=$2
  docker run blacklabelops/java:$tagname java -version
  if [ "${distribution}" = "jdk" ]; then
    docker run blacklabelops/java:$tagname javac -version
  fi
  docker run blacklabelops/java:$tagname which java
  docker run blacklabelops/java:$tagname sh -c 'echo $JAVA_HOME'
}

testImage "$@"
