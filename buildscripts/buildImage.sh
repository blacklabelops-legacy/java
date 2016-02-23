#!/bin/bash -x

set -o errexit    # abort script at first error

function buildImage() {
  local dockerfile=$1
  local tagname=$2
  local distribution=$3
  local major_version=$4
  local update_version=$5
  local build_number=$6
  docker build --no-cache -t blacklabelops/java:$tagname \
    --build-arg JAVA_DISTRIBUTION=$distribution \
    --build-arg JAVA_MAJOR_VERSION=$major_version \
    --build-arg JAVA_UPDATE_VERSION=$update_version \
    --build-arg JAVA_BUILD_NUMBER=$build_number \
    -f $dockerfile .
}

buildImage "$@"
