pipeline {
    agent any
    tools {
            maven 'Maven 3.5.3'
            jdk 'JDK 8'
    }
    stages {

        stage ('Initialize') {
            steps {
                sh '''
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage('Build') {
            steps {
                echo 'Build ...'
                script {
                    if (env.BRANCH_NAME == 'master') {
                       sh 'mvn clean install'
                    } else {
                        echo 'Branch != master'
                    }
                }
            }
        }

    }
}