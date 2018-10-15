package com.ws.dmp.doordashlite.utils;

/**
 * Created by prade on 10/13/2018.
 */

public class DataWrapper<T> {
    private Exception exception;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}