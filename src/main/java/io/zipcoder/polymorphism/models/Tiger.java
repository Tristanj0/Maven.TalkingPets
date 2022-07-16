package io.zipcoder.polymorphism.models;

import io.zipcoder.polymorphism.interfaces.Pets;

public class Tiger extends Pets {

    public Tiger(String petName) {
        super(petName);
    }

    protected String speak() {
        return "roar";
    }
}
