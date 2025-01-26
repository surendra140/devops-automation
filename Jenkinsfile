pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'
    }
    stages{
        stage("Build Maven Project"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/surendra140/devops-automation']])
                bat 'mvn clean install'
            }
        }
        stage("Build docker image"){
            steps{
                script{
                    bat 'docker build -t surendra140/devops-automation .'
                }
            }
        }
        stage("push docker image to hub"){
            steps{
                script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                   bat 'docker login -u surendra140 -p Sb246@123'
                 }
                 bat 'docker push surendra140/devops-automation'
                }
            }
        }
    }

}