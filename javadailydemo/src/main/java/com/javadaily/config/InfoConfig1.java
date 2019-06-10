package com.javadaily.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 通过value取配置文件中的数据
 */
@Component
@PropertySource(value = {"classpath:config/db-config.properties"})
public class InfoConfig1 {

    @Value("${db.username}")
    private String useranme;
    @Value("${db.password}")
    private String password;

    public String getUseranme() {
        return useranme;
    }

    public void setUseranme(String useranme) {
        this.useranme = useranme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "";
    }

}
