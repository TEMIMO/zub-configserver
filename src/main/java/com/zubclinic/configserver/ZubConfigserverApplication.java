package com.zubclinic.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ZubConfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZubConfigserverApplication.class, args);
    }

}
