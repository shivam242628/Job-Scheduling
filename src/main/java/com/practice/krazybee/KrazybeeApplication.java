package com.practice.krazybee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KrazybeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KrazybeeApplication.class, args);
    }
}
