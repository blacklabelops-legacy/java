/** Jenkins 2.0 Buildfile
 *
 * Master Jenkins 2.0 can be started by typing:
 * docker run -d -p 8090:8080 --name jenkins blacklabelops/jenkins
 *
 * Slave 'docker' can be started by typing:
 * docker run -d -v /var/run/docker.sock:/var/run/docker.sock --link jenkins:jenkins -e "SWARM_CLIENT_LABELS=docker" blacklabelops/swarm-dockerhost
 **/
node {
  checkout scm
  stage 'Build & Test Images'
  parallel(
    //"image-openjdk": { load 'java-openjdk/Jenkinsfile' },
    //"image-jdk6-alpine": { load 'java-jdk-6-alpine/Jenkinsfile' },
    //"image-jdk6-centos": { load 'java-jdk-6-centos/Jenkinsfile' },
    "image-oracle-centos": { load 'java-oracle-centos/Jenkinsfile' })
    //"image-oracle-alpine": { load 'java-oracle-alpine/Jenkinsfile' })
}
