def buildApp() {
    echo "building the application..."
    sh "npm install"
     
} 

def testApp() {
    echo 'testing the application'
}

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t papis84/my-repo:njsa-1.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push papis84/my-repo:njsa-1.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
