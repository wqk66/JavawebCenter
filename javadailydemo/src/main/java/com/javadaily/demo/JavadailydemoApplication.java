package com.javadaily.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JavadailydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavadailydemoApplication.class, args);
    }

}
