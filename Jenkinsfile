node{
  stage('SCM Checkout'){
    git 'https://github.com/Sonam-Learner/2019_DevOps'
  }
  stage('Compile-Package'){
    //Get maven home path
    def mvnHome=tool name: 'Maven-3', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
}
