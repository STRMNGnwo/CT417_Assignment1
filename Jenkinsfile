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
    
    stage("END")
    {
      steps{
        echo "Project should have completed building using Gradle."
      }
    }
    
    
  }
  
}
