pipeline {
    agent any

    environment {
        GITHUB_TOKEN = credentials('Atul')
    }

    stages {

        stage('Build') {
            steps {
                echo "Running build..."
                sh 'mvn clean install -B'
            }
        }

        stage('Test') {
            steps {
                echo "Running tests..."
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo "Build succeeded!"
        }
        failure {
            echo "Build failed!"
        }
    }
}
