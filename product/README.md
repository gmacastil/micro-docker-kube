# Compilacion

mvn clean package

# Crear imagen

docker build . -t product:7

# Lanzar el container

docker compose up -d

# Publicar la imagen en registry

docker login

docker tag product:6 mauron/product:7
docker push mauron/product:7