pipeline{
    agent any
    stages{
        stage('build aplication'){
            steps{
                bat 'test --tests runners.RunnerBuyProducts aggregate'
            }
        }
    }
}