pipeline {
  agent any
  stages {
    stage("Compile") {
      steps {
        sh 'javac TempMethod2.java'
        echo "Compiling..."
  }
}
    stage("Test") {
      steps {
        echo "Testing..."
      }
    }
    stage("Build Docker image"){
      steps{
        sh 'docker build -t lfarul/tempmethod2:6.0.0 .'
        echo "Building Docker image..."
      }
    }
    stage("Push Docker image"){
      steps{
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubpwd')]) {
          sh "docker login -u lfarul -p ${dockerHubpwd}"
        }
        sh 'docker push lfarul/tempmethod2:6.0.0'
        echo "Pushing Docker image..."
      }
    }
  }
}

