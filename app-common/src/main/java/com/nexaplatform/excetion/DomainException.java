package com.nexaplatform.excetion;

import java.util.List;

public class DomainException extends RuntimeException {

    private final String code;
    private final List<String> messages;

    public DomainException(String code, List<String> messages) {
        this.code = code;
        this.messages = messages;
    }
}
