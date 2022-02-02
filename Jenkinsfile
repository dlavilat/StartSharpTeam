pipeline{
    agent any
    stages{
        stage('deploy aplication'){
            steps{
                bat 'gradlew clean build -x test'
            }
        }
        stage('deploy aplication'){
            steps{
                bat 'gradlew test --tests runners.RunnerBuyProducts aggregate'
            }
        }
    }
}