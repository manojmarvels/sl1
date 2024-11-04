def gitdownload(repo)
{
   git "https://github.com/manojmarvels/${repo}.git"
}

def build()
{
  sh 'mvn package'
}

def deploy(jobname,ip,context)
{
  sh "/var/lib/jenkins/workspace/${jobname}/server/target/server.jar ubuntu@${ip}:8080 /var/lib/tomcat9/webaaps/${context}.war"
}
