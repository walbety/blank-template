## To connect pgadmin with postgres database
- run docker container ls
- copy the container id os postgres image running
- access http://localhost:16543/ or the port which corresponds to pg-admin in the docker-compose file
- use the credentials defined for pg-admin
- click Add New Server
- in the field  Name, chose at your discretion
- in the tab Connection
  - Host name/address: paste the container id
  - Port: the postgres port defined in the compose file
  - Username and Password: same as defined in the compose file for postgres

## First time running with flyway
it's necessary to create the database configured in application.properties
  example: CREATE DATABASE sample;