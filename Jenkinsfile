
node{
    tool name: 'maven-3', type: 'maven'
    stage 'checkout'
         git branch: 'dev', url: 'https://github.com/Sonam-Learner/2019_DevOps.git'
    
    stage('Compile-Package')
      // get maven home path
      sh label: '', script: 'mvn package'
      //def mvnHome = tool name: 'maven-3', type: 'maven'
      //sh "${mvnHome}/bin/mvn package"

    
    stage 'Build Docker Compose'
        sh 'docker-compose -f docker-compose.yml build'
   
   
    stage 'Running Docker Compose' 
         sh 'docker-compose -f docker-compose.yml up -d'

    
    


}

