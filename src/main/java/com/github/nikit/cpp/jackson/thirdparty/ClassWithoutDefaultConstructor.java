package com.github.nikit.cpp.jackson.thirdparty;

import java.util.Collection;

/**
 * Created by nik on 15.04.17.
 */
public class ClassWithoutDefaultConstructor {
    private String string;
    private Collection<Animal> animals;

    public ClassWithoutDefaultConstructor(String string, Collection<Animal> animals) {
        this.string = string;
        this.animals = animals;
    }

    public String getString() {
        return string;
    }

    /*public void setString(String string) {
        this.string = string;
    }*/

    public Collection<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Collection<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "ClassWithoutDefaultConstructor{" +
                "string='" + string + '\'' +
                ", animals=" + animals +
                '}';
    }
}
