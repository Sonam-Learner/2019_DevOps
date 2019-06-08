
node{
    stage 'checkout'
         git branch: 'dev', url: 'https://github.com/Sonam-Learner/2019_DevOps.git'
    
    stage 'Build Docker Compose'
        sh 'sudo docker rm $(sudo docker ps -aq) -f || exit 0'
        sh 'export REACT_APP_USERS_SERVICE_URL=http://localhost'
        sh 'sudo docker-compose -f docker-compose.yml build'
   
   
    stage 'Running Docker Compose' 
         sh 'sudo docker-compose -f docker-compose.yml up -d'

}

