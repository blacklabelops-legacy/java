# Dockerized Java Images

## Supported OpenJDK Images

| Java Version | Tag | Dockerfile |
|--------------|-----|------------|
| Java JRE 8 | openjre.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-openjdk/Dockerfile) |
| Java JDK 8 | openjdk.8 | [Dockerfile](https://github.com/blacklabelops/java/blob/master/java-openjdk/Dockerfile) |

# Make It Short

~~~~
$ docker run blacklabelops/java java -version
~~~~

> Will print the java version on console.

# How-To Extend

Example Dockerfile:

~~~~
FROM blacklabelops/java
MAINTAINER Your Name <your@email.com>

RUN Install-Your-Tooling
~~~~

> Will use Java JRE 8 as your base image.

Need the JDK?

Example Dockerfile:

~~~~
FROM blacklabelops/java:jdk8
MAINTAINER Your Name <your@email.com>

RUN Install-Your-Tooling
~~~~

> Will use Java JDK 8 as your base image.

# Build Image

Take a Dockerfile and build with the default arguments:

~~~~
$ docker build -t blacklabelops/java -f java-openjdk/Dockerfile .
~~~~

Build a specific version with the following build arguments:

* JAVA_DISTRIBUTION: jdk, jre, or server-jre (default: jdk)
* JAVA_MAJOR_VERSION: 7 or 8
* JAVA_UPDATE_VERSION: The minor version.
* JAVA_BUILD_NUMBER: The build number.

# References

* [Docker Homepage](https://www.docker.com/)
* [Docker Userguide](https://docs.docker.com/userguide/)
