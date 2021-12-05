package com.example.fuck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FuckApplication {


    public static void main(String[] args) {
        SpringApplication.run(FuckApplication.class, args);
    }

}
