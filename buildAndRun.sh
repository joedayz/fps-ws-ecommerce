#!/bin/sh
mvn clean package && docker build -t pe.farmaciasperuanas.ecommerce/fps-ws-ecommerce .
docker rm -f fps-ws-ecommerce || true && docker run -d -p 8080:8080 -p 4848:4848 --name fps-ws-ecommerce pe.farmaciasperuanas.ecommerce/fps-ws-ecommerce 
