package com.nexaplatform.excetion;

import java.util.List;

public class DomainException extends RuntimeException {

    private String description;
    private final String code;
    private final List<String> messages;

    public DomainException(String code, List<String> messages) {
        this.code = code;
        this.messages = messages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public List<String> getMessages() {
        return messages;
    }
}
