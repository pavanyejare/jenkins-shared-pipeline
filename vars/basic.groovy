def call(name){
  echo "welcome $name"
  
}

def checkout(repourl){
	git branch: 'main', url: "${repourl}"
	}
