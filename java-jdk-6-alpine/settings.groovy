/**
 * Jenkins 2.0 Buildfile
 **/

imageArgs = [
    [ "jdk",
      "jdk",
      settings.oracle_6_java_major_version,
      settings.oracle_6_java_update_version,
      settings.oracle_6_java_build_number]
  ] as String[][]

dockerImages = ["blacklabelops/alpine:3.4"] as String[]

dockerWorkspace = "java-jdk-6-alpine"

return this;
