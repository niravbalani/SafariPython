pipeline {
  
  agent any
  environment {
      NEW_VERSION = '1.3.0' 
  }
  stages {
    
    stage("build") {
      
      steps{
        echo 'build application... works'
        echo "${env.BRANCH_NAME}"
        echo "building version ${NEW_VERSION}"
        
      }    
    }  
    
    stage("test") {
      when {
        expression {
          env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'master'
        }
      }
      steps{
        echo 'test application...works'
      }    
    }  
    
    stage("deploy") {
      
      steps{
        echo 'deploy application...works'
      }    
    }  
  }
  post {
    always {
      // run always though build failed
  
    }
    
    success{
    }
    failure {
    }
  }
}
