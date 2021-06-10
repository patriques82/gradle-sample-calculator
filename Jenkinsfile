pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './gradlew classes'
      }
    }
    stage('Test') {
      when {
        anyOf {
          branch 'develop'
          branch 'main'
        }
      }
      steps {
        sh './gradlew test'
      }
    }
    stage('Package') {
      when {
        branch 'main'
      }
      steps {
        sh './gradlew jar'
      }
    }
  }
}
