
node{
    stage 'checkout'
         git branch: 'dev', url: 'https://github.com/Sonam-Learner/2019_DevOps.git'
    
    stage 'Build Docker Compose'
        sh 'docker-compose build'
    
    stage 'Run application'
        sh 'docker build Dockerfile .'
   
    stage 'Running Docker Compose' 
        sh 'docker-compose up'
    
    


}

