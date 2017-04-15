package com.github.nikit.cpp.jackson.thirdparty;

/**
 * Created by nik on 15.04.17.
 */
public class AnimalDog extends AbstractAnimal {
    private double length;

    public AnimalDog(String name, double length) {
        super(name);
        this.length = length;
    }

    public AnimalDog() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "AnimalDog{" +
                "name=" + getName() +
                ", length=" + length +
                '}';
    }
}
