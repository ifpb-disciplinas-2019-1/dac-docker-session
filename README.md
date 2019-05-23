# SessionBeans

Esta aplicação tem o objetivo de apresentar o **deploy** de uma aplicação corporativa usando
os servidores de aplicação [Payara](https://www.payara.fish/) e o [Wildfly](https://wildfly.org/). 
Para este fim foi utilizado o [Docker](https://www.docker.com/) e as seguintes `images` e configurações foram aplicadas:

## [Wildlfy](https://hub.docker.com/r/jboss/wildfly/dockerfile)
```
FROM jboss/wildfly
COPY target/app.war ${JBOSS_HOME}/standalone/deployments/
```
## [Payara Web Profile](https://hub.docker.com/r/payara/server-web)
```
FROM payara/server-web
COPY target/app.war $DEPLOY_DIR
```

## [Payara Micro Profile](https://hub.docker.com/r/payara/micro)
```
FROM payara/micro
COPY target/app.war  ${DEPLOY_DIR}
```

Caso queira altarar a `image` utilizada, é necessário atualizar no arquivo `Dockerfile`, basicamente descomentando a `image` escolhida.