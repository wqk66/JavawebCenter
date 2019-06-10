package com.javadaily.userlogin;

public class Result<T> {
    private Integer errCode;
    private String errMessage;
    private T data;

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString(){
        return "Result{" +
                "errCode="+errCode+",errMessage="+errMessage+",data="+data+"}";
    }
}
