package com.sde.guide.graphql.server;

import graphql.schema.idl.RuntimeWiring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }


}
