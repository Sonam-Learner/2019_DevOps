
node{
    tool name: 'maven-3', type: 'maven'
    stage 'checkout'
         git branch: 'dev', url: 'https://github.com/Sonam-Learner/2019_DevOps.git'
    
    stage 'compile,test, package'
         def mvnHome = tool name: 'maven-3', type: 'maven'
         sh "${mvnHome}/bin/mvn package"
   
    stage 'archival' 
        archiveArtifacts 'target/*.jar'
    
    stage 'Build Docker Compose'
        sh 'docker-compose -f docker-compose.yml build'
   
   
    stage 'Running Docker Compose' 
         sh 'docker-compose -f docker-compose.yml up -d'

    
    


}

