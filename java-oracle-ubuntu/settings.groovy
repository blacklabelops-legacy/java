/**
 * Jenkins 2.0 Buildfile
 **/

imageArgs = [
    [ "ubuntu.jdk",
      "jdk",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number],
    [ "ubuntu.jre",
      "jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number],
    [ "ubuntu.server-jre",
      "server-jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number],
    [ "ubuntu.jdk",
      "jdk",
      settings.oracle_7_java_major_version,
      settings.oracle_7_java_update_version,
      settings.oracle_7_java_build_number],
    [ "ubuntu.jre",
      "jre",
      settings.oracle_7_java_major_version,
      settings.oracle_7_java_update_version,
      settings.oracle_7_java_build_number],
    [ "ubuntu.server-jre",
      "server-jre",
      settings.oracle_7_java_major_version,
      settings.oracle_7_java_update_version,
      settings.oracle_7_java_build_number]
  ] as String[][]

dockerImages = ["blacklabelops/ubuntu:16.04"] as String[]

dockerWorkspace = "java-oracle-ubuntu"

return this;
