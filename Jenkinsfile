pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './gradlew classes'
      }
    }
    stage('Test') {
      steps {
        sh './gradlew test'
      }
    }
    stage('Package') {
      steps {
        sh './gradlew jar'
      }
    }
  }
}
