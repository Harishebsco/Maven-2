pipeline {
   agent any
   tools {
       maven 'Maven3'
     
   }
   stages {
       stage('Checkout') {
           steps {
               git branch: 'main', url: 'https://github.com/Harishebsco/Maven-2.git'
           }
       }
       stage('Build & Test') {
           steps {
               sh 'mvn clean test'
           }
       }
   }
   post {
       success {
           echo "✅ Build & tests successful!"
       }
       failure {
           echo "❌ Build or tests failed."
       }
   }
}
