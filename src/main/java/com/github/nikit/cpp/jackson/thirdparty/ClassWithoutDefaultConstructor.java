package com.github.nikit.cpp.jackson.thirdparty;

import java.util.Collection;

/**
 * Created by nik on 15.04.17.
 */
public class ClassWithoutDefaultConstructor {
    private String string;
    private Collection<Animal> animals;
    private Object principal;

    public ClassWithoutDefaultConstructor(String string, Collection<Animal> animals, Object principal) {
        this.string = string;
        this.animals = animals;
        this.principal = principal;
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
                ", principal=" + principal +
                '}';
    }

    public Object getPrincipal() {
        return principal;
    }

    public void setPrincipal(Object principal) {
        this.principal = principal;
    }
}
