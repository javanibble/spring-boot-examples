# The HelloDocker Example

## Running the Example

### Building the Docker Image

```
$ docker build -t javanibble/spring-boot-docker .
```

```
$ docker run -p 8080:8080 -t javanibble/spring-boot-docker
```

### Calling the Service
Once the service is up and running, there are a number of ways to call the service. The first is to simply place the two URLs below in a browser.

* http://localhost:8080/hellodocker
* http://localhost:8080/hellodocker?name=Andre

The second way to call the service is to run CURL commands from the command line. The first request calls the service without the name parameter.

**Execute:**

The following CURL command send a GET request to the URL and add two sets of headers to the request message.
```
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/hellodocker
```

**Output:**
```
HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Content-Length: 18
Date: Fri, 21 Jul 2017 05:22:07 GMT

Hello World !!!
```

The second request calls the service with the name parameter to receive a custom greeting.

**Execute:**

The following CURL command send a GET request to the URL and add two sets of headers to the request message. The URL contains an optional parameter to specify a name for the personal greeting.
```
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/hellodocker?name=Andre
```

**Output:**
```
HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Content-Length: 18
Date: Fri, 21 Jul 2017 05:22:58 GMT

Hello Andre !!!
```

## Summary
This example illustrated a simple REST service called 'hellodocker' that is deployed as a Spring Boot application running in a docker container.
