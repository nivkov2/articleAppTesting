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
                   sh './gradlew clean test'
                }
            }
        }
        stage('reports') {
            steps {
                script {
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'build/allure-results']]
                    ])
                }
            }
        }
    }
}
