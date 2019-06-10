package com.javadaily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.javadaily.bean")
@EnableJpaRepositories("com.javadaily.mapper")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LoginandregisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginandregisterApplication.class, args);
	}

}
