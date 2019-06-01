node{
    stage ('checkout'){
        git branch: 'dev', url: 'https://github.com/Sonam-Learner/2019_DevOps.git'
    }
    stage ('compile,test, package'){
        def mvnHome = tool name: 'maven-3', type: 'maven'
        sh l"${mvnHome}/bin/mvn package"
    }
    stage ('archival'){
        archiveArtifacts 'target/*.jar'
    }
}
