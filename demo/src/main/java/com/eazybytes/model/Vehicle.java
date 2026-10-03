package com.eazybytes.model;

import org.springframework.stereotype.Component;

public class Vehicle {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Inside Vehicle class");
    }
}
