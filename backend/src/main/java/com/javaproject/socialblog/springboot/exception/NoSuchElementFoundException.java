package com.javaproject.socialblog.springboot.exception;

public class NoSuchElementFoundException extends RuntimeException {
    public NoSuchElementFoundException(String message) {
        super(message);
    }
}
