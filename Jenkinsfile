
node{
    stage 'checkout'
    git branch: 'dev', url: 'https://github.com/Sonam-Learner/2019_DevOps.git'
    
    stage 'compile package'
    bat label: '', script: 'mvn clean package'
   
    stage 'archival' 
    archiveArtifacts 'target/*.jar'

}

