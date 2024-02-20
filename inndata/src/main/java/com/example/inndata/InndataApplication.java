package com.example.inndata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

import com.example.inndata.openfineclint.Fineclint;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.inndata.openfineclint")
public class InndataApplication {
    public static void main(String[] args) {
        SpringApplication.run(InndataApplication.class, args);
    }
}

