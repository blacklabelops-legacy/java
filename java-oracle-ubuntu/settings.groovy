/**
 * Jenkins 2.0 Buildfile
 **/

imageArgs = [
    [ "ubuntu.jdk",
      "jdk",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number,
      settings.oracle_8_java_hash],
    [ "ubuntu.jre",
      "jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number,
      settings.oracle_8_java_hash],
    [ "ubuntu.server-jre",
      "server-jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number,
      settings.oracle_8_java_hash]
  ] as String[][]

dockerImages = ["blacklabelops/ubuntu:16.04"] as String[]

dockerWorkspace = "java-oracle-ubuntu"

return this;
