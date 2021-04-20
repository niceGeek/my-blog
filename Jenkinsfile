pipeline {
   agent any
   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
            git 'https://github.com/niceGeek/my-blog.git'

            // Run Maven on a Unix agent.
            //sh "./mvnw -Dmaven.test.failure.ignore=true clean package"

             // To run Maven on a Windows agent, use
            bat "mvn clean package"
         }
      }

      stage('Run all tests') {
          steps {
                      // Get some code from a GitHub repository
                      git 'https://github.com/niceGeek/my-blog.git'

                      // Run unit and integration tests.
                      bat "mvn clean verify"
                   }

          post {
                 // If Maven was able to run the tests, even if some of the test
                 // failed, record the test results and archive the jar file.
                 success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                 }
          }
      }

       stage('Deploy') {
                  steps {
                      echo "Deployment should happen in this stage!"
                  }

       }
   }
}