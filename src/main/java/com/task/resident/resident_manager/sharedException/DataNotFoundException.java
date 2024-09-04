package com.task.resident.resident_manager.sharedException;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DataNotFoundException extends RuntimeException {

    @Getter
    private final String errorCode;

    public DataNotFoundException(String message) {
        super(message);
        this.errorCode = "RESOURCE_NOT_FOUND";
    }

    public DataNotFoundException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = "RESOURCE_NOT_FOUND";
    }
}
