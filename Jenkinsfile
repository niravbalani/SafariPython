pipeline {
  agent any
  
  tools{
    gradle 'MyGradle'
  }
  
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
        sh './gradlew -v'
      }
    }
  }
}
