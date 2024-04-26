package com.demo.exception;

import java.io.Serial;

public class ResourceAlreadyExistException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public ResourceAlreadyExistException() {
        super();
    }

    public ResourceAlreadyExistException(String message) {
        super(message);
    }

    public ResourceAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
