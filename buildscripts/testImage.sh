#!/bin/bash -x

set -o errexit    # abort script at first error

function testImage() {
  local tagname=$1
  docker run blacklabelops/java:$tagname java -version
  docker run blacklabelops/java:$tagname javac -version
  docker run blacklabelops/java:$tagname which java
  docker run blacklabelops/java:$tagname sh -c 'echo $JAVA_HOME'
}

testImage "$@"
