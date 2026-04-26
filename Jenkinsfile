pipeline {
    agent {
        any
    }

    environment {
        PATH = "/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:${env.PATH}"
    }

    tools {
        maven 'maven'
    }

    stages {
        stage('Test & Package') {
            steps {
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