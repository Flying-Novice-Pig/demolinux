package com.xiaohu.demolinux.dto;

public class Response {
    private String status;
    private String message;
    private Object obj;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
    public void returnSuccess(Object obj){
        this.status="00";
        this.message="success";
        this.obj = obj;
    }
    public void returnFailure(String errorMessage){
        this.status="01";
        this.message = message;
    }
}
