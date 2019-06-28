package com.jason.transporteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TransportEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransportEurekaApplication.class, args);
    }

}
