
def download(repo)
{
  git "https://github.com/manojmarvels/${repo}.git"
}
def build()
{
  sh 'mvn package'
}
def deploy(jobname,ip,context)
{
  sh "scp /var/lib/Jenkins/workspace/${jobname}/webapp/target/webapp.war   ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
