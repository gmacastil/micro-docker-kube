# Compilacion
```sh
mvn clean package
```
# Crear imagen
```sh
docker build . -t product:7
```
# Lanzar el container
```sh
docker compose up -d
```
# Publicar la imagen en registry

```sh
docker login
docker tag product:6 mauron/product:7
docker push mauron/product:7
```
# Desplegar los manifiestos en k8s
```sh
kubectl apply -f .
```
