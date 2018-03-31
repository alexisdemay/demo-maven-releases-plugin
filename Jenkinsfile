node {

   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Checkout code from repository
   checkout scm

   def mvnHome = tool 'Maven 3.5.3'

   // Mark the code build 'stage'....
   stage 'Build'

   // Run the maven build
   sh "${mvnHome}/bin/mvn clean install"

}