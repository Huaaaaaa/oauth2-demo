package com.oauth2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication(scanBasePackages = "com.oauth2.demo")
@EnableWebFlux
public class Oauth2DemoApplication {

    public static void main(String[] args) {
         SpringApplication.run(Oauth2DemoApplication.class, args);
    }

}
