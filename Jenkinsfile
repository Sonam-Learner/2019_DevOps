
node{
    stage 'checkout'
         git branch: 'dev', url: 'https://github.com/Sonam-Learner/2019_DevOps.git'
    
    stage 'Build Docker Compose'
        sh 'sudo docker-compose -f docker-compose.yml build'
   
   
    stage 'Running Docker Compose' 
         sh 'sudo docker-compose -f docker-compose.yml up -d'

}

