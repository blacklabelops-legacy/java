/**
 * Jenkins 2.0 Buildfile
 **/

def pushImages(dockerRepositories,branchName,imageargs) {
  stage 'Repository-Push'
  for (int i=0;i < imageargs.length;i++) {
    if (!"latest".equals(imageargs[i][0])) {
      echo 'Setting new tagname'
      tagname = imageargs[i][0] + "." + imageargs[i][2]
      echo 'Tagname: ' + tagname

      echo 'Pushing Image'
      dockerPush(dockerImageName,tagname,branchName,dockerRepositories[0][0])

      echo 'Setting new tagname'
      tagname = imageargs[i][0] + "." + imageargs[i][2] + "." + imageargs[i][3]
      echo 'Tagname: ' + tagname

      echo 'Pushing Image'
      dockerPush(dockerImageName,tagname,branchName,dockerRepositories[0][0])
    } else {
      dockerPush(dockerImageName,imageargs[i][0],branchName,dockerRepositories[0][0])
    }
  }
}

/**
 * Docker needs three parameters to work, I distributed those Credentials inside
 * two Jenkins-UsernamePassword Credentials.
 * Credentials 'Dockerhub' with Dockerhub username and password
 * Credentials 'DockerhubEmail' with the email inside the password field.
 **/
def repositoryLogin(remoteRepository,credentialsAId,credentialsBId) {
  echo 'Login to Dockerhub with Credentials Dockerhub and DockerhubEmail'
  withCredentials([[$class: 'UsernamePasswordMultiBinding',
    credentialsId: credentialsAId,
    usernameVariable: 'USERNAME',
    passwordVariable: 'PASSWORD']]) {
    withCredentials([[$class: 'UsernamePasswordMultiBinding',
      credentialsId: credentialsBId,
      usernameVariable: 'DUMMY',
      passwordVariable: 'EMAIL']]) {
      sh 'docker login --email $EMAIL --username $USERNAME --password $PASSWORD ' + remoteRepository
    }
  }
}

def dockerPush(imageName, tagName, branchName, remoteRepository) {
    def branchSuffix = branchName?.trim() ? '-' + branchName : ''
    def repositoyToken = remoteRepository?.trim() ? remoteRepository + '/' : ''
    def image = remoteRepository + imageName + ':' + tagName + branchSuffix
    sh 'docker push ' + image
}

return this;
