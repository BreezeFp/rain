package com.breeze.rain.web.exception;

public class UserNotExistException extends RuntimeException {

    private Object id;

    public UserNotExistException(Object id) {
        super("该用户不存在");
        this.id = id;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }
}
