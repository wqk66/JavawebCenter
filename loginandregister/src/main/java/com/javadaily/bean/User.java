package com.javadaily.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class User {
    private Long id;
    private String username;
    private String password;

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
