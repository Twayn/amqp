#Some info

Get Jenkins for JDK 17

[First page](https://www.jenkins.io/blog/2022/03/21/java17-preview-availability/)

[Second page](https://www.jenkins.io/doc/administration/requirements/jenkins-on-java-17/)

Commands to run:
```
docker pull jenkins/jenkins:lts-jdk11
```

```
docker run --rm -ti -p 9090:8080 -p 50000:50000 -v C:/dev/jenkins_docker_mount:/var/jenkins_home jenkins/jenkins:lts-jdk11
```
- -rm (Automatically remove the container when it exits)
- -v (Bind mount a volume)
- -p (Publish port - left part is host; right is image)
- -ti (Connect to network or smt.)

Build image
```
./gradlew build 
```

```
docker build -t twayn-amqp . 
```

Tag image
```
docker tag twayn-amqp:latest twayn-amqp:v1.0.0
```

Run my app in container
```
docker run --rm -p 8080:8080 twayn-amqp:latest
```

Docker compose
```
docker-compose build
```
```
docker-compose up
```

Run app as fat jar
```
 java -jar .\build\libs\amqp-0.0.1-SNAPSHOT.jar
```

Rabbit MQ console
```
http://localhost:15672/    (guest/guest)
```
