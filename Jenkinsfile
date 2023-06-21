
pipeline {
    // install golang 1.14 on Jenkins node
    agent any
    stages {
        stage("unit-test") {
            steps {
                echo 'UNIT TEST EXECUTION STARTED'
            }
        }
        stage("functional-test") {
            steps {
                echo 'FUNCTIONAL TEST EXECUTION STARTED'
            }
        }
        stage("synopsys-security-scan") {
            steps {
                echo 'SYNOPSYS SECURITY SCAN EXECUTION STARTED'
                synopsys_scan param1: 'BLACK_DUCK', param2: '--help'
            }
        }
        stage("build") {
            steps {
                echo 'BUILD EXECUTION STARTED'
                echo 'Pulling...' + env.BRANCH_NAME
            }
        }
    }
}