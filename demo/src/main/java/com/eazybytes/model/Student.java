package com.eazybytes.model;

public class Student {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Inside Student class");
    }
}