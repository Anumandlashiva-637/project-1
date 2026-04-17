pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    environment {
        IMAGE_NAME = "telecom-app"
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Anumandlashiva-637/project-1.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonar-server') {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t customer-service ./customer-service'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f k8s/'
            }
        }
    }
}
