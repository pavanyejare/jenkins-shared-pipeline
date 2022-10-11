def call(name){
  echo "welcome $name"
  
}

def checkout(repourl,branch){
	git branch: "${branch}", url: "${repourl}"
	}
