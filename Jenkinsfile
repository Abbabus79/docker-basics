def gv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: false, description: '')
    }
    stages {
            stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage('test') {
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
