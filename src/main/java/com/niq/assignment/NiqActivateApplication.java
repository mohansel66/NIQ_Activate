package com.niq.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@   EntityScan(basePackages = "com.niq.assignment.model")
public class NiqActivateApplication {

    public static void main(String[] args) {
        SpringApplication.run(NiqActivateApplication.class, args);
    }

}
