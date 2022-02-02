pipeline{
    agent any
    stages{
        stage('build aplication'){
            steps{
                bat 'gradlew clean build -x test'
            }
        }
        stage('deploy aplication'){
            steps{
                bat 'gradlew test --tests runners.RunnerProducts aggregate'
            }
        }
    }
}