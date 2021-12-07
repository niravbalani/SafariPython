def buildApp() {
    echo 'build application... works'
    echo "${env.BRANCH_NAME}"
    echo "building version ${NEW_VERSION}"
}

def testApp() {
    echo 'test application...works'
    echo "during test version ${params.VERSION}"
}

def deployApp() {
    echo 'deploy application...works'
    echo "deploying with ${params.VERSION}"
}

return this
