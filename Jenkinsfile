pipeline {
  agent any
  stages {
    stage("run fontend") {
      steps {
        echo 'executing yarn...'
        nodejs('MyNodeJS_17.2'){
          sh 'yarn install'
        }
      }
      
    }
    stage("run backend") {
      steps {
        echo 'executing gradle...'
        withGradle(){
          sh './gradlew -v'
        }
      }
    }
  }
}
