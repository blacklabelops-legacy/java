/**
 * Jenkins 2.0 Buildfile
 **/

imageArgs = [
    [ "centos.jdk",
      "jdk",
      settings.oracle_6_java_major_version,
      settings.oracle_6_java_update_version,
      settings.oracle_6_java_build_number]
  ] as String[][]

dockerImages = ["blacklabelops/centos:7.2.1511"] as String[]

dockerWorkspace = "java-jdk-6-centos"

return this;
