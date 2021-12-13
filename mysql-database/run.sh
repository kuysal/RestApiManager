DATABASE_IMAGE_NAME="rest-api-database"

function docker_close_container(){
	echo "[DEBUG][Container][Delete][Start] $1"
	echo "[DEBUG][Container][Delete][StoppingContainer] $1"
	docker stop $1
	echo "[DEBUG][Container][Delete][DeletingContainer] $1"
	docker rm $1
	echo "[DEBUG][Container][Delete][Complete] $1"
}


docker_close_container ${DATABASE_IMAGE_NAME}

docker container run -d --net rest-api-network -v mysql-storage:/var/lib/mysql -p 3309:3306  --name rest-api-database ${DATABASE_IMAGE_NAME}
