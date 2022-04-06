pipeline {
    agent any
    stages {
        stage('Build project') {
            steps {
                echo 'Start building'
                bat "./gradlew build"
            }
        }

        stage('Docker build') {
            steps {
                bat "docker-compose build"
            }
        }

        stage('Docker up') {
            steps {
                bat "docker-compose up -d"
            }
        }

//         stage('Smoke test') {
//             steps {
//
//             }
//         }

//         stage('Docker stop') {
//             steps {
//                 bat "docker-compose stop"
//             }
//         }
    }
}