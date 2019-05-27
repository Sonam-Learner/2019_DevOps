node{
  stage('SCM Checkout'){
    git 'https://github.com/Sonam-Learner/2019_DevOps'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
