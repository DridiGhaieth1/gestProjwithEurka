package com.esprit.gestprojwitheurk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GestProjwithEurkApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestProjwithEurkApplication.class, args);
    }

}
