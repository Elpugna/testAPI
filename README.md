# testAPI
A extremely simple Java Api


This simple API is intended to run using docker, in **src/main/docker** you will find the docker-compose file. 
If you make any changes to the application, you first need to follow certain steps to see them running when executing the docker-compose command:

- Delete de previously built image ( **docker rmi testapiimage:latest**)
- Re-package the application (**mvn clean package -DskipTests** # Here we skip tests because the database connection fails if the container is not up and running)
- Copy the generated .jar into the docker folder (**cp target/testapi.jar src/main/docker**)
- execute docker-compose up