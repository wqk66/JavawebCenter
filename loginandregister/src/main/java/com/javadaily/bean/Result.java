package com.javadaily.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

public class Result<T> {
    private String retMsg;
    private boolean isSuccess;
    private T detail;

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }
}
