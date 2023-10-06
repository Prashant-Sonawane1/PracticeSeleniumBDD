pipeline {
    agent any

        tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven 3.2.2"
    }

 
    stages {
        stage('Build') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
 
            post {                
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                   publishHTML([
                       allowMissing: false, 
                       alwaysLinkToLastBuild: false, 
                       keepAll: false, 
                       reportDir: 'test-output/SparkReport', 
                       reportFiles: 'Spark.html', 
                       reportName: 'HTML Report', 
                       reportTitles: '', 
                       useWrapperFileDirectly: true])
                }
            }
        }
    }
}
