# jax-rs-examples
A bunch of examples on how to use JAX-RS in order to serve up REST endpoints.  Also contains a minimal maven config for Jersey.

## Project Setup
This project uses [Jersey](https://jersey.java.net) to provide the JAX-RS implmentation.  In order to use this with Maven, add the following to your pom.xml:

```
        <dependency>
            <groupId>org.glassfish.jersey.containers</groupId>
            <artifactId>jersey-container-servlet-core</artifactId>
            <version>2.21</version>
        </dependency>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-web-api</artifactId>
            <version>7.0</version>
            <scope>provided</scope>
        </dependency>
```

As well, [Genson](http://owlike.github.io/genson/) is used to provide JSON support for JAX-RS.

## REST Endpoints
There are several endpoints already defined.  Some take a GET request, others take a POST request.  

# Got more ideas?
Create a bug or a pull request.  The idea here is to have a lot of minimal examples so that people can see how everything works together

# Finally
Feel free to use this project as a starting point for your own project.  No software license is provided, since this is designed to be just a repository of examples.

(if you really really want a license for it, use the (WTFPL)[http://www.wtfpl.net/about/])
