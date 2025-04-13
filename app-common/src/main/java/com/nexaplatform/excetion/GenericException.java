package com.nexaplatform.excetion;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class GenericException extends RuntimeException {

    private String code;
    private String description;
    private List<String> messages;
    private HttpStatus status;

    public GenericException(){}

    public GenericException(String code, String description){
        this.code = code;
        this.description = description;
    }

    public GenericException(String code, String description, HttpStatus status){
        this.code = code;
        this.description = description;
        this.status = status;
    }

    public GenericException(String code, String description, List<String> messages){
        this.code = code;
        this.description = description;
        this.messages = messages;
    }

    public GenericException(String code, String description, List<String> messages, HttpStatus status) {
        this.code = code;
        this.description = description;
        this.messages = messages;
        this.status = status;
    }
}
