# Spring Boot Examples: Simple Console Application

## Quick Summary
This example show you how to create a Spring Boot application and make use of the CommandLineRunner to read values 
from the command line and print them out.

## Compile & Run The Example

### 1. Compile the application
The following commands show you how to compile the application from the command line:

```shell script
$ mvn clean install
```

### 2. Run the application
The following commands show you how to run the application from the command line:

```shell script
$ mvn spring-boot:run -Dspring-boot.run.arguments=Hello,World
```