pipeline {
   agent any
   tools {
       maven 'Maven3'   // name from Global Tool Configuration
   }
   stages {
       stage('Checkout') {
           steps {
               git 'https://github.com/Harishebsco/hello-maven.git'
           }
       }
       stage('Build with Maven') {
           steps {
               sh 'mvn clean package'
           }
       }
   }
   post {
       success {
           archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
           echo "Build successful! JAR archived."
       }
   }
}
