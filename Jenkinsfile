pipeline {
  
  agent any
  
  stages {
    
    stage("build") {
      
      steps{
        echo 'build application... works'
        echo env.BRANCH_NAME
      }    
    }  
    
    stage("test") {
      when {
        expressopn {
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
