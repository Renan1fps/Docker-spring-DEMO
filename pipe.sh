echo install AWS CLI

sleep 8

mvn clean package

docker build -t vr-api:latest -f ./Dockerfile .

docker run --name vr-api -d -p 3025:3025 vr-api:latest

sleep 10

docker logs vr-api

sleep 20

docker stop vr-api


