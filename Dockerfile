FROM airhacks/glassfish
COPY ./target/fps-ws-ecommerce.war ${DEPLOYMENT_DIR}
