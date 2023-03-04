

pipeline {
    agent any
    parameters {
               booleanParam(name: 'executeTests', defaultValue: false, description: '')
    }
    stages {
            stage("build") {
            steps {
                script {
                    echo "building the application"
                }
            }
        }
        stage('test') {
             when {
                expression {
                    params.executeTests
                }
            steps {
                script {
                    echo "Testing the application..."
                }
           
        stage("deploy") {
            steps {
                script {
                    echo "Deploying the application..."
                }
            }
        }
    }
}

