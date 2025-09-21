pipeline {
   agent any
   tools {
       maven 'Maven3'   // Use the Maven installation name in Jenkins Global Tools
   }
   stages {
       stage('Checkout') {
           steps {
               git 'https://github.com/Harishebsco/Maven-2.git'
           }
       }
       stage('Build') {
           steps {
               sh 'mvn clean package'
           }
       }
       stage('Test Results') {
           steps {
               junit '**/target/surefire-reports/*.xml'
           }
       }
   }
   post {
       success {
           archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
           echo "✅ Build successful! JAR archived."
       }
       failure {
           echo "❌ Build failed."
       }
   }
}
