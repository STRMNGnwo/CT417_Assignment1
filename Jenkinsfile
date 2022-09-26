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
        
       dir("./Assignment1GradleProject"){
        sh'''
          ls -a
          ./gradlew build
        '''
       }
      
      }
      
    }   
  }
    
   post{
    
    success{
     echo "end of pipeline"
     deploy(adapters:[tomcat9(url:"http://localhost:8443",credentialsId:"tomcatmanager",path:"/manager/text'")], war:"**/build/libs/*.war",contextPath: "/deployedArtifacts")
     
    }
    
   }
   
}
