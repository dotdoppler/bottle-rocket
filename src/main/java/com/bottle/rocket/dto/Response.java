package com.bottle.rocket.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private String messageId;


    private Code code;

    private byte status;

    private String desc = "";

    public Response() {
    }

    public Response(String messageId, Code code, String desc) {
        this.messageId = messageId;
        this.code = code;
        this.desc = desc;
    }

    public enum Code {
        SUCCESS,
        FAIL
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

