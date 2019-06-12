
node{
    stage 'checkout'
         git branch: 'dev', url: 'https://github.com/Sonam-Learner/2019_DevOps.git'
    
    stage 'compile,test, package'
         sh label: '', script: 'mvn clean package'
   
    stage 'archival' 
        archiveArtifacts 'target/*.jar'
    
    stage 'Build Docker Compose'
        sh 'docker-compose -f docker-compose.yml build'
   
   
    stage 'Running Docker Compose' 
         sh 'docker-compose -f docker-compose.yml up -d'

    
    


}

