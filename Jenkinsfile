pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Anumandlashiva-637/project-1.git/telecom-devops-project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn -f customer-service/pom.xml clean package'
                sh 'mvn -f billing-service/pom.xml clean package'
                sh 'mvn -f plan-service/pom.xml clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh '''
                eval $(minikube docker-env)
                docker build -t customer-service ./customer-service
                docker build -t billing-service ./billing-service
                docker build -t plan-service ./plan-service
                '''
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f k8s/'
            }
        }
    }
}
