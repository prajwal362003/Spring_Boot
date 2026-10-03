package com.eazybytes.model;

import org.springframework.stereotype.Component;

@Component
public class School {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
