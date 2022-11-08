package com.bootcamp.demo.bean;

import java.util.HashMap;
import java.util.Map;

public abstract class FormBean {
    private Map<String, String> errors;

    public FormBean() {
        errors = new HashMap<>();
    }

    public void addError(String fieldName, String errorMessage) {
        errors.put(fieldName, errorMessage);
    }

    public String getError(String fieldName) {
        String errorMessage = errors.get(fieldName) != null ? errors.get(fieldName) : "";
        return errorMessage;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void clearErrors() {
        errors.clear();
    }

    public abstract boolean validate();
}
