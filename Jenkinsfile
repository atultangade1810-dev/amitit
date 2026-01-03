pipeline {
    agent any

    environment {
        // Bind the GitHub token from Jenkins credentials
        GITHUB_TOKEN = credentials('Atul')
    }

    stages {

        stage('Checkout') {
            steps {
                echo "Checking out code using GitHub token"
                // Using https with token for authentication
                git(
                    url: "https://github.com/atultangade1810-dev/amitit.git",
                    credentialsId: "Atul"
                )
            }
        }

        stage('Build') {
            steps {
                echo "Running build..."
                // Example using Maven; adjust if your project uses a different build tool
                sh "mvn clean install -B"
            }
        }

        stage('Test') {
            steps {
                echo "Running tests..."
                sh "mvn test"
            }
        }
    }

    post {
        always {
            echo "Pipeline finished!"
        }
        success {
            echo "Build succeeded!"
        }
        failure {
            echo "Build failed!"
        }
    }
}
