pipeline{
 
  agent any
  
  stages{
    
    stage("Initial"){
     
      steps{
        echo "Initial stage of the pipeline"
      }
    }
    
    stage("Build"){
     
      steps{
        echo "Building the project using Gradle"
        
        sh'''
          ls -a
          ./Assignment1GradleProject/gradlew build
        '''
      
      }
      
    }
    
   stage("Deploy"){
    
    steps{
     echo "Deploying to tomcat"
     deploy(adapters:[tomcat9("http://localhost:8081",credentialsId:"tomcat-deployer",path:"deployedArtifacts")], war:"**/*.war",contextPath: "deployedArtifacts")
    }
   }
    
    stage("END")
    {
      steps{
        echo "Project should have completed building using Gradle.Doing a ls to check for built artifact"
        sh '''
         ls -a
         cd Assignment1GradleProject
         ls -a
        '''
       
      }
    }
    
    
  }
  
}
