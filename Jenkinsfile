pipeline {
  agent any
  stages {
    stage("run fontend") {
      echo 'executing yarn...'
    }
    stage("run backend") {
      echo 'executing gradle...'
      withGradle(){
        sh './gradlew -v'
      }
    }
  }
}
