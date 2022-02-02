pipeline{
    agent{
        label 'agentprueba'
    }
    stages{
        stage('build aplication'){
            steps{
                bat 'test --tests runners.RunnerBuyProducts aggregate'
            }
        }
    }
}