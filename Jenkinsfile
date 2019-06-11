
node{
    stage 'checkout'
         git branch: 'dev', url: 'https://github.com/Sonam-Learner/2019_DevOps.git'
    
    stage 'Compile-Package' 
          def mvnHome = tool name: 'maven-3', type: 'maven'
          sh "${mvnHome}/bin/mvn package"
    
    stage 'Build Docker Compose'
        sh 'docker-compose up'
   
   
    stage 'Running Docker Compose' 
         sh 'docker-compose -f docker-compose.yml up -d'
    
     stage 'Build Dcker Image'
          withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPwd')]) {
            sh "docker login -u gcitsonam -p ${dockerHubPwd}"
          }
          sh 'docker build -t gcitsonam/epharmacy:1.0.0 .'
    
    stage 'Push Dcker Image'
          withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPwd')]) {
          sh "docker login -u gcitsonam -p ${dockerHubPwd}"
          }
          sh 'docker push gcitsonam/epharmacy:1.0.0'
    
    stage 'Run Container on Dev Server' 
          sh 'docker run -p 8089:8089 -d gcitsonam/epharmacy:1.0.0'


}

