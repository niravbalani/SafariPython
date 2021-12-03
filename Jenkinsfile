pipeline {
  agent any
  stages {
    stage("run fontend") {
      echo 'executing yarn...'
      nodejs('Node-17.2.0'){
        sh 'yarn install'        
      }
    }
    stage("run backend") {
      echo 'executing gradle...'
      withGradle(){
        sh './gradlew -v'
      }
    }
  }
}
