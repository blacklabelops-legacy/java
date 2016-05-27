/**
 * Jenkins 2.0 Buildfile
 **/

 def getBranchName() {
   def branchName = env.JOB_NAME.replaceFirst('.+/', '')
   echo 'Building on Branch: ' + branchName
   def tagPostfix = ''
   if (branchName != null && !'master'.equals(branchName)) {
      tagPostfix = branchName
   }
   return tagPostfix
 }

def buildJobPullImages(dockerImages) {
  for (int i=0;i < dockerImages.length;i++) {
    pullImage(dockerImages[i])
  }
}

def buildJobCI(dockerWorkspace,dockerImageName,dockerTestCommands,branchName,imageargs) {
  for (int i=0;i < imageargs.length;i++) {
    if (!"latest".equals(imageargs[i][0])) {
      echo 'Setting new tagname'
      tagname = imageargs[i][0] + "." + imageargs[i][2]
      echo 'Tagname: ' + tagname

      echo 'Building Image'
      buildImage(dockerWorkspace,dockerImageName,tagname,branchName,imageargs[i])

      echo 'Testing Image'
      testImage(dockerImageName,tagname,branchName,dockerTestCommands)

      echo 'Setting new tagname'
      tagname = imageargs[i][0] + "." + imageargs[i][2] + "." + imageargs[i][3]
      echo 'Tagname: ' + tagname

      echo 'Building Image'
      buildImage(dockerWorkspace,dockerImageName,tagname,branchName,imageargs[i])

      echo 'Testing Image'
      testImage(dockerImageName,tagname,branchName,dockerTestCommands)
    } else {
      echo 'Building Image'
      buildImage(dockerWorkspace,dockerImageName,imageargs[i][0],branchName,imageargs[i])

      echo 'Testing Image'
      testImage(dockerImageName,imageargs[i][0],branchName,dockerTestCommands)
    }
  }
}

def pullImage(imageName) {
  echo 'Refreshing image: ' + imageName
  sh 'docker pull ' + imageName
}

def testImage(imageName, tagName, branchName, dockerCommands) {
  def branchSuffix = branchName?.trim() ? '-' + branchName : ''
  def image = imageName + ':' + tagName + branchSuffix
  for (int i=0;i < dockerCommands.length;i++) {
    echo 'Testing image: ' + image
    sh 'docker run --rm ' + image + ' ' + dockerCommands[i]
  }
}

def buildImage(dockerWorkspace, imageName, tagName, branchName, buildargs) {
  def branchSuffix = branchName?.trim() ? '-' + branchName : ''
  def image = imageName + ':' + tagName + branchSuffix
  echo 'Building image: ' + image
  sh 'cd ' + dockerWorkspace + ' && docker build --no-cache --build-arg JAVA_DISTRIBUTION=' + buildargs[1] + ' --build-arg JAVA_MAJOR_VERSION=' + buildargs[2] + ' --build-arg JAVA_UPDATE_VERSION=' + buildargs[3] + ' --build-arg JAVA_BUILD_NUMBER=' + buildargs[4] + ' -t ' + image + ' .'
}

return this;
