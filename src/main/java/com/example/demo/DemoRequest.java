package com.example.demo;

import javax.validation.constraints.NotNull;

public class DemoRequest {

    @NotNull
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
