node{
    stage ('checkout'){
        git 'https://github.com/Sonam-Learner/2019_DevOps.git'
    }
    stage ('compile-package'){
        def mvnHome = tool name: 'maven-3', type: 'maven'
        sh l"${mvnHome}/bin/mvn package"
    }
}
