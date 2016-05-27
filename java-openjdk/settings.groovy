/**
 * Jenkins 2.0 Buildfile
 **/

imageArgs = [
    ["latest",
      "jdk",
      settings.openjdk_8_java_major_version,
      settings.openjdk_8_java_update_version,
      settings.openjdk_8_java_build_number],
    ["openjdk." + settings.openjdk_8_java_major_version + "." settings.openjdk_8_java_update_version,
      "jdk",
      settings.openjdk_8_java_major_version,
      settings.openjdk_8_java_update_version,
      settings.openjdk_8_java_build_number]
  ] as String[][]

dockerImages = ["blacklabelops/alpine:3.3"] as String[]

return this;
