package com.example.fuck.Pojo;

import com.fasterxml.jackson.databind.util.JSONPObject;

public class PublicRequest<T> {
    private JSONPObject header;
    private JSONPObject tail;
    private T body;
    public PublicRequest() {
    }

    public JSONPObject getHeader() {
        return header;
    }

    public void setHeader(JSONPObject header) {
        this.header = header;
    }

    public JSONPObject getTail() {
        return tail;
    }

    public void setTail(JSONPObject tail) {
        this.tail = tail;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }


}
