package com.demo.exception;

import java.io.Serial;

public class RequestInValidException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public RequestInValidException() {
        super();
    }

    public RequestInValidException(String message) {
        super(message);
    }

    public RequestInValidException(String message, Throwable cause) {
        super(message, cause);
    }
    }