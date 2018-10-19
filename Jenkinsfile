pipeline {

    agent {
        node {
            label 'master'
        }
    }

    options {
        gdJobOptions(team: 'timd112',
                project: 'mercyme',
                gitOrg: 'timd112',
                environment: 'dev',
                sendResults: false)
    }

    stages {
        stage('Test with Coverage') {
          options{
            gdStageOptions(type: 'test', testType: 'unit')
          }
            steps {
                withMaven(maven: 'maven3') {
                    sh "mvn -Penable-coverage clean test"
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
