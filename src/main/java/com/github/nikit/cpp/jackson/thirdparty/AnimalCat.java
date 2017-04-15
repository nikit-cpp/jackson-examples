package com.github.nikit.cpp.jackson.thirdparty;

/**
 * Created by nik on 15.04.17.
 */
public class AnimalCat extends AbstractAnimal {
    private int weight;

    //public AnimalCat() { }

    public AnimalCat(int weight, String name) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "AnimalCat{" +
                "name=" + getName() +
                ", weight=" + weight +
                '}';
    }
}
