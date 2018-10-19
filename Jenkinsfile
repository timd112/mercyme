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
                    sh "mvn -Penable-jacoco clean test"
                }

                cobertura(
                  autoUpdateHealth          : false,
                  autoUpdateStability       : false,
                  coberturaReportFile       : '**/target/site/cobertura/coverage.xml',
                  conditionalCoverageTargets: '70, 0, 0',
                  failUnhealthy             : false,
                  failUnstable              : false,
                  lineCoverageTargets       : '80, 0, 0',
                  maxNumberOfBuilds         : 0,
                  methodCoverageTargets     : '80, 0, 0',
                  onlyStable                : false,
                  sourceEncoding            : 'ASCII',
                  zoomCoverageChart         : false)

                junit(testResults: '**/target/surefire-reports/*.xml')
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
