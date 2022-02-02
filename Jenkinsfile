pipeline {
  
  agent any
  environment {
      NEW_VERSION = '1.3.0' 
      // SERVER_CRED = credentials('server_cred')
  }
  /*parameters {
    choice(name:'VERSION', choices:['1.1.0', '1.2.0', '1.3.0'], description:'Version being deployed')
    booleanParam(name:'executeTest', defaultValue: true, description:'')
  }
  */
  stages { 
    stage("build") {
      steps{
        echo 'build application... works'
        // echo "${env.BRANCH_NAME}"
        // echo "building version ${NEW_VERSION}"
      }    
    }  
    
    stage("test") {
      /* when {
        expression {
          env.BRANCH_NAME == 'dev' || params.executeTest
        }
      }*/
      steps{
        echo 'test application...works'
        // echo "deploying during test version ${params.VERSION}"
      }    
    }  
    
    stage("deploy") {
      
      steps{
        echo 'deploy application...works'
        // echo "deploying with ${SERVER_CRED}"
      }    
    }  
  }
/*  post {
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
  } */
}
