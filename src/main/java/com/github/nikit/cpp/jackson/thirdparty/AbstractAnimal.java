package com.github.nikit.cpp.jackson.thirdparty;

/**
 * Created by nik on 15.04.17.
 */
public abstract class AbstractAnimal {
    private String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public AbstractAnimal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
