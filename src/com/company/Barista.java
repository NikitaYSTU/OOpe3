package com.company;

public class Barista implements Info {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return ("Бариста "+ name);
    }

    public String getAnotherInfo(){return (" ");}
}
