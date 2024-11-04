def gitdownload(repo)
{
   git "https://github.com/manojmarvels/${repo}.git"
}

def build()
{
  sh 'mvn package'
}
def deploy(jobame,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war   ubuntu@${ip}:8080 /var/lib/tomcat9/webapps/${appname}.war"
}

