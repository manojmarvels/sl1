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
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:8080 /var/lib/tomcat9/webaaps/${context}.war"
}
