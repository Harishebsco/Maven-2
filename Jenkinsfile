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
               sh 'mvn clean package'
           }
           post {
               always {
                   junit 'target/surefire-reports/*.xml'
               }
           }
       }
       stage('Archive JAR') {
           steps {
               archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
           }
       }
      stage('Test & Coverage') {
            steps {
                 sh 'mvn clean verify'
           }
        }
      stage('Publish Coverage Report') {
             steps {
                jacoco execPattern: '**/target/jacoco.exec',
          classPattern: '**/target/classes',
          sourcePattern: '**/src/main/java',
          inclusionPattern: '**/*.class',
          exclusionPattern: '**/*Test*'
 }
}
   }
   post {
       always {
       junit 'target/surefire-reports/*.xml'
       }
       success {
           echo "✅ Build, test, and packaging successful!"
       }
       failure {
           echo "❌ Something went wrong."
       }
   }
} 
