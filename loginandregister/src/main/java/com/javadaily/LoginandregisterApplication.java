package com.javadaily;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.javadaily.mapper.*")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LoginandregisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginandregisterApplication.class, args);
	}

}
