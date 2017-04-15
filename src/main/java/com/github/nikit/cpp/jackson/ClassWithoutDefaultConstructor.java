package com.github.nikit.cpp.jackson;

/**
 * Created by nik on 15.04.17.
 */
public class ClassWithoutDefaultConstructor {
    private String string;

    public ClassWithoutDefaultConstructor(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
