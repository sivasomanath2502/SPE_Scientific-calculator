pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "sivasomanath2502/scientific-calculator"
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
                sh 'docker tag scientific-calculator sivasomanath2502/scientific-calculator:latest'
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
                    sh 'docker push $DOCKER_IMAGE:latest'
                }
            }
        }

        stage('Deploy with Ansible') {
            steps {
                sh 'ansible-playbook -i inventory.ini deploy.yml'
            }
        }
    }
    post {
    success {
        mail(
            to: "sivasomanath25@gmail.com",
            subject: "Build Success",
            body: "Build completed successfully: ${env.BUILD_URL}"
        )
    }
    failure {
        mail(
            to: "sivasomanath25@gmail.com",
            subject: "Build Failed",
            body: "Build FAILURE: ${env.BUILD_URL}"
        )
    }
  }
}
