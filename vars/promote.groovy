import main.java.Parser

def call(String appCode) {
    pipeline {
        agent any

        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                    echo "--------->${appCode}<---------"
                    script {
                        def vars = parser.getProviderServices(this, "service.yml", "ms-il-jdbc")

                    }
                }
            }
        }
    }
}
