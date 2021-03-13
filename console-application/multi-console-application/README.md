# Spring Boot Examples: Multi Console Application

## Quick Summary
This article describes how to create a Spring Boot application and make use of multiple CommandLineRunner beans within 
the same application context. The order in which different beans execute the run methods, is controlled by the @Order 
annotation. 

## Compile & Run The Example

### 1. Compile the application
The following commands show you how to compile the application from the command line:

```shell script
$ mvn clean install
```

### 2. Run the application
The following commands show you how to run the application from the command line:

```shell script
$ mvn spring-boot:run
```