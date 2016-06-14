/**
 * Jenkins 2.0 Buildfile
 **/

imageArgs = [
    [ "centos.jdk",
      "jdk",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number],
    [ "centos.jre",
      "jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number],
    [ "centos.server-jre",
      "server-jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number],
    [ "centos.jdk",
      "jdk",
      settings.oracle_7_java_major_version,
      settings.oracle_7_java_update_version,
      settings.oracle_7_java_build_number],
    [ "centos.jre",
      "jre",
      settings.oracle_7_java_major_version,
      settings.oracle_7_java_update_version,
      settings.oracle_7_java_build_number],
    [ "centos.server-jre",
      "server-jre",
      settings.oracle_7_java_major_version,
      settings.oracle_7_java_update_version,
      settings.oracle_7_java_build_number]
  ] as String[][]

dockerImages = ["blacklabelops/centos:7.2.1511"] as String[]

dockerWorkspace = "java-oracle-centos"

return this;
