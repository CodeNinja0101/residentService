package com.task.resident.resident_manager.sharedException;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    private final String message;
    private final int statusCode;
    private final String errorCode;
}
