/**
 * Jenkins 2.0 Buildfile
 **/

imageArgs = [
    [ "latest",
      "jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number],
    [ "jdk",
      "jdk",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number],
    [ "jre",
      "jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number],
    [ "server-jre",
      "server-jre",
      settings.oracle_8_java_major_version,
      settings.oracle_8_java_update_version,
      settings.oracle_8_java_build_number],
    [ "jdk",
      "jdk",
      settings.oracle_7_java_major_version,
      settings.oracle_7_java_update_version,
      settings.oracle_7_java_build_number],
    [ "jre",
      "jre",
      settings.oracle_7_java_major_version,
      settings.oracle_7_java_update_version,
      settings.oracle_7_java_build_number],
    [ "server-jre",
      "server-jre",
      settings.oracle_7_java_major_version,
      settings.oracle_7_java_update_version,
      settings.oracle_7_java_build_number]
  ] as String[][]

dockerImages = ["blacklabelops/alpine:3.3"] as String[]

dockerWorkspace = "java-oracle-alpine"

return this;
