package io.zipcoder.polymorphism.models;

import io.zipcoder.polymorphism.interfaces.Pets;

public class Dog extends Pets {
    public Dog(String petName) {
        super(petName);
    }

    public String speak() {
        return "woof";
    }


}
