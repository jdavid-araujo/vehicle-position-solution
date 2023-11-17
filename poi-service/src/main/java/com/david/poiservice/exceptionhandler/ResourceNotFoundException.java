package com.david.poiservice.exceptionhandler;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String e) {
        super(e);
    }
}
