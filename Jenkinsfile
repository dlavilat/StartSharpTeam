pipeline{
    agent any
    stages{
        stage('build aplication'){
            steps{
                bat 'gradlew test --tests runners.RunnerBuyProducts aggregate'
            }
        }
    }
}