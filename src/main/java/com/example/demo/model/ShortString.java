package com.example.demo.model;

public class ShortString {
    private final String value;

    public ShortString(String value) {
        if(value == null) {
            throw new NullPointerException("Value can not be null");
        }
        if(value.length() > 64) {
            throw new IllegalArgumentException("Value can not be longer than 64");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
