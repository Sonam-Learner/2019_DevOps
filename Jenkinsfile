node{
  stage('SCM Checkout'){
    git 'https://github.com/Sonam-Learner/2019_DevOps'
  }
  stage('Compile-Package'){
     bat label: '', script: 'mvn clean package'
     archiveArtifacts 'target/*.jar'
  }
}
