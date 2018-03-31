pipeline {
    agent any
    parameters {
        string(name: 'VERSION', defaultValue: '1.0.0', description: 'Version')
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building v${VERSION} ...'
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing ...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying ...'
            }
        }
    }
}