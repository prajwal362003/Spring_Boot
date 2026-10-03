package com.eazybytes.model;

public class Player {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Inside Player Class");
    }
}
