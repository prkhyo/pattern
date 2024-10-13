package com.example.outbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringOutboxApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringOutboxApplication.class, args);
    }
}
