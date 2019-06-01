node{
    stage ('checkout'){
        git branch: 'dev', url: 'https://github.com/Sonam-Learner/2019_DevOps.git'
    }
    stage ('compile-package'){
        def mvnHome = tool name: 'maven-3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
}
