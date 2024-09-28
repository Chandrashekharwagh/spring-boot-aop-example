package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AopExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(AopExampleApplication.class, args);
    }
}
