package com.example.CRUD.models;

//this is a wrapper
public class ResponseModel<T> {

    private Head head = new Head();

    private T body;

    public void setBody(T body) {
        this.body = body;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
