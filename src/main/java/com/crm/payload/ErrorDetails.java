package com.crm.payload;

import java.util.Date;

public class ErrorDetails {
    private Date date;
    private String msg;
    private String request;

    public String getRequest() {
        return request;
    }

    public ErrorDetails(Date date, String msg, String request) {
        this.date = date;
        this.msg = msg;
        this.request = request;
    }

    public Date getDate() {
        return date;
    }

    public String getMsg() {
        return msg;
    }


}
