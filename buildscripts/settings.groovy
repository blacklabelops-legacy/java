/**
 * Jenkins 2.0 Buildfile
 **/

/**
 * Build parameters, must be adjusted when forked!
 **/
dockerImageName = 'blacklabelops/java'
dockerTestCommandsJDK =
["java -version",
 "javac -version",
 "which java"] as String[]
dockerTestCommandsJRE =
 ["java -version",
  "which java"] as String[]
dockerRepositories = [["","Dockerhub","DockerhubEmail"]] as String[][]

oracle_8_java_major_version = "8"
oracle_8_java_update_version = "162"
oracle_8_java_build_number = "12"
oracle_8_java_hash="0da788060d494f5095bf8624735fa2f1"

openjdk_8_java_major_version = "8"
openjdk_8_java_update_version = "151"
openjdk_8_java_build_number = "12-r0"

http://download.oracle.com/otn-pub/java/jdk/8u162-b12/0da788060d494f5095bf8624735fa2f1/jdk-8u162-linux-x64.tar.gz

return this;
