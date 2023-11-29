package com.mycompany.latihan1.exception;

public class ProgramException extends Throwable {
    private String message;

    public ProgramException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
