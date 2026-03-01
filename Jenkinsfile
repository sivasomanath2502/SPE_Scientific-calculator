pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "scientific-calculator"
    }

    stages {

        stage('Build & Test') {
            steps {
                sh 'mvn clean verify'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t scientific-calculator .'
                sh 'docker tag scientific-calculator yourdockerhubusername/scientific-calculator:latest'
            }
        }

        stage('Push Docker Image') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'docker-hub-credential',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                    sh 'docker push sivasomanath2502/scientific-calculator:latest'
                }
            }
        }
    }
}