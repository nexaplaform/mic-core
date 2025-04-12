package com.nexaplatform.excetion;

import java.util.List;

public class DomainException extends RuntimeException {

    private final String otro;
    private String description;
    private final String code;
    private final List<String> messages;

    public DomainException(String otro, String code, List<String> messages) {
        this.otro = otro;
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

    public String getOtro() {
        return otro;
    }
}
