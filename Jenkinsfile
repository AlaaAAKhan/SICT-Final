pipeline {
    agent {
        label 'built-in'
    }

    tools {
        maven 'maven'
    }

    stages {
        stage('Test & Package') {
            steps {
                // This is the correct place for the 'steps' method
                sh 'mvn clean package'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t java-calc-app .'
            }
        }
    }
}