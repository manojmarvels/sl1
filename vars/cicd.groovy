def gitdownload(repo)
{
   git "https://github.com/manojmarvels/${repo}.git"
}

def build()
{
  sh 'mvn package'
}

