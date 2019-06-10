package com.javadaily;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//关闭数据源，redis自动配置
@ComponentScan(basePackages = {"com.javadaily.userlogin"})
public class JavadailydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavadailydemoApplication.class, args);
    }
}
