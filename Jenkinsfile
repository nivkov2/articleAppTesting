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
        stage('Reports') {
            allure([
                includeProperties: false,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'target/allure-results']]
            ])
        }
    }
}
