# Wildfly
FROM jboss/wildfly
COPY target/app.war ${JBOSS_HOME}/standalone/deployments/
#Criando um usuario "Application User" para uso futuro
#RUN /opt/jboss/wildfly/bin/add-user.sh -a ricardojob job.2016 --silent
#CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-c", "standalone.xml", "-b", "0.0.0.0"]

# Payara Micro
#FROM payara/micro
#COPY target/app.war  ${DEPLOY_DIR}

# Payara Web Profile
#FROM payara/server-web
#COPY target/app.war $DEPLOY_DIR


#docker run -p 8080:8080 -v ~/payara/apps:/opt/payara/deployments payara/server-web


