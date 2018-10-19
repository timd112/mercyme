pipeline {

    agent {
        node {
            label 'master'
        }
    }

    options {
        gdJobOptions(team: 'timd112',
                project: 'mercyme'
                gitOrg: 'timd112',
                sendResults: false)
    }

    stages {

        stage('Test with Coverage') {
            steps {
                withMaven(maven: 'maven3') {
                    sh "mvn -Ptest-coverage clean test"
                }
            }
        }

        stage('Package') {
            steps {
                withMaven(maven: 'maven3') {
                    sh "mvn clean package -DskipTests"
                }
            }
        }
    }
}
