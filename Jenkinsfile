pipeline {
    agent any
    stages {
        stage('Checkout code') {
                steps {
                    checkout scm
                }
        }
        stage('Functional Tests') {
            steps {
                script {
                   sh './gradlew test'
                }
            }
        }
    }
}
