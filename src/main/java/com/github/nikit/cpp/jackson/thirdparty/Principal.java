package com.github.nikit.cpp.jackson.thirdparty;

/**
 * Created by nik on 16.04.17.
 */
public class Principal {
    private String name;
    private String surname;

    public Principal() { }

    public Principal(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
