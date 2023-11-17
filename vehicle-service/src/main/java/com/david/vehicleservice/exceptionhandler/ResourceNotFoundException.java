package com.david.vehicleservice.exceptionhandler;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String e) {
        super(e);
    }
}
