def call(name){
  echo "welcome $name"
  
}

def checkout(url){
	git branch: 'main', url: $url
	}
