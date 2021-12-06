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
          env.BRANCH_NAME == 'dev'
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
      steps {
        echo 'always runs this after build'
      }
    }
    
    success{
      steps {
        echo 'success runs this after build'
      }
    }
    failure {
      steps {
        echo 'Failure runs this after build'
      }
    }
  }
}
