/**
 * Jenkins 2.0 Buildfile
 **/

imageArgs = [
    [ "centos.jdk",
      "jdk",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number,
      settings.oracle_8_java_hash],
    [ "centos.jre",
      "jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number,
      settings.oracle_8_java_hash],
    [ "centos.server-jre",
      "server-jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number,
      settings.oracle_8_java_hash]
  ] as String[][]

dockerImages = ["blacklabelops/centos:7.4.1708"] as String[]

dockerWorkspace = "java-oracle-centos"

return this;
