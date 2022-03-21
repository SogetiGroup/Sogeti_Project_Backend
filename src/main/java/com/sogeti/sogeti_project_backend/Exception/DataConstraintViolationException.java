package com.sogeti.sogeti_project_backend.Exception;

public class DataConstraintViolationException extends Exception{
    public DataConstraintViolationException(String message) {
        super(message);
    }
}
