package com.argo.controller;

public class Result {
    private Object data;
    private Integer code;
    private String message;

    public Result(Integer code, Object data, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }

    public Result() {
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
