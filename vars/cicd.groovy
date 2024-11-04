def gitdownload(repo)
{
   git "https://github.com/manojmarvels/${repo}.git"
}

def build()
{
  sh 'mvn package'
}

def deploy(jn,ip,contxt)
{
   sh "scp /var/lib/jenkins/workspace/${jn}/webapp/target/webapp.war ubuntu@${ip}:8080 /var/lib/tomcat9/webapps/${contxt}.war"
}
