pipeline {
    agent any

    tools {
        maven 'M3'
    }

    environment {
        GITHUB_TOKEN = credentials('Atul')
    }

    stages {

        stage('Build') {
            steps {
                echo "Running Maven build on Windows..."
                bat 'mvn clean install -B'
            }
        }

        stage('Test') {
            steps {
                echo "Running Maven tests..."
                bat 'mvn test'
            }
        }
    }

    post {
        success {
            echo "✅ Build succeeded!"
        }
        failure {
            echo "❌ Build failed!"
        }
    }
}
