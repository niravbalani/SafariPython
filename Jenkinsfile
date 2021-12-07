def gv

pipeline {
  
  agent any
  environment {
      NEW_VERSION = '1.3.0' 
      SERVER_CRED = credentials('server_cred')
  }
  parameters {
    choice(name:'VERSION', choices:['1.1.0', '1.2.0', '1.3.0'], description:'Version being deployed')
    booleanParam(name:'executeTest', defaultValue: true, description:'')
  }
  stages {
    
    stage("init") {
      steps {
        script {
          gv = load "script.groovy"
        }
      }
    }
    stage("build") {      
      steps{
        script {
          gv.buildApp()
        }
      }    
    }  
    
    stage("test") {
      when {
        expression {
          env.BRANCH_NAME == 'dev' || params.executeTest
        }
      }
      steps{
        script {
          gv.testApp()
        }
      }    
    }  
    
    stage("deploy") {
      
      steps{
        script {
          gv.deployApp()
        }
      }    
    }  
  }
}
