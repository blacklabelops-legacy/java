/**
 * Jenkins 2.0 Buildfile
 **/

imageArgs = [
    [ "openjdk",
      "jdk",
      settings.openjdk_8_java_major_version,
      settings.openjdk_8_java_update_version,
      settings.openjdk_8_java_build_number],
    [ "openjre",
      "jdk",
      settings.openjdk_8_java_major_version,
      settings.openjdk_8_java_update_version,
      settings.openjdk_8_java_build_number],
    [ "openjdk",
      "jdk",
      settings.openjdk_7_java_major_version,
      settings.openjdk_7_java_update_version,
      settings.openjdk_7_java_build_number],
    [ "openjre",
      "jre",
      settings.openjdk_7_java_major_version,
      settings.openjdk_7_java_update_version,
      settings.openjdk_7_java_build_number]
  ] as String[][]

dockerImages = ["blacklabelops/alpine:3.3"] as String[]

dockerWorkspace = "java-openjdk"

return this;
