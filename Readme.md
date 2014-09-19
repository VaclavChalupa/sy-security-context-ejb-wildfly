Security context not propagated to EJB in WildFly
=================================================

Usage:
------

1. Create new application user `authorized` with password `authorized.p1` and `authorized` role:

        $JBOSS_HOME/bin/add-user.sh

2. Deployment:

        mvn clean package wildfly:deploy

3. CURL:

        curl -v -X GET http://localhost:8080/api/service/permit-all --user "authorized:authorized.p1"
        curl -v -X GET http://localhost:8080/api/service/roles-allowed --user "authorized:authorized.p1"
