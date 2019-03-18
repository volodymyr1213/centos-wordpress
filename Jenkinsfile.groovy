pipeline{
    agent any
    stages{
        stage("run packer"){
            steps{
                sh "packer build -var-file=/centos-wordpress/versions.json image.json "
            }
        }
    }
}
