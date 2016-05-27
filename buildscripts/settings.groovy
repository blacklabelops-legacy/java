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
 "which java",
 "sh -c \'echo $JAVA_HOME\'"] as String[]
dockerTestCommandsJRE =
 ["java -version",
  "which java",
  "sh -c \'echo $JAVA_HOME\'"] as String[]
dockerRepositories = [["","Dockerhub","DockerhubEmail"]] as String[][]

ORACLE_6_JAVA_MAJOR_VERSION = 6
ORACLE_6_JAVA_UPDATE_VERSION = 45
ORACLE_6_JAVA_BUILD_NUMBER = 06

ORACLE_7_JAVA_MAJOR_VERSION = 7
ORACLE_7_JAVA_UPDATE_VERSION = 80
ORACLE_7_JAVA_BUILD_NUMBER = 15

ORACLE_8_JAVA_MAJOR_VERSION = 8
ORACLE_8_JAVA_UPDATE_VERSION = 92
ORACLE_8_JAVA_BUILD_NUMBER = 14

OPENJDK_8_JAVA_MAJOR_VERSION = 8
OPENJDK_8_JAVA_UPDATE_VERSION = 92
OPENJDK_8_JAVA_BUILD_NUMBER = 14-r0

OPENJDK_7_JAVA_MAJOR_VERSION = 7
OPENJDK_7_JAVA_UPDATE_VERSION = 91
OPENJDK_7_JAVA_BUILD_NUMBER = 2.6.3-r1

return this;
