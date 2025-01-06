pipeline {
  /*
   * TODO: Implement pipeline stages/steps
   *   See documentation: https://www.jenkins.io/doc/book/pipeline/syntax/#stages
   */

   pipeline {
       agent any

       stages {
           stage('Build') {
               steps {
                   // TODO: Build the project
                   sh './gradlew assemble'
               }
           }

           stage('Test') {
               steps {
                   // TODO: Run the tests
                   sh './gradlew test'
               }
           }
       }

       post {
           success {
               echo 'Build and Test completed successfully.'
           }
           failure {
               echo 'Build or Test failed.'
           }
       }
   }

}
