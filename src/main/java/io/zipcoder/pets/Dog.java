package io.zipcoder.pets;

public class Dog extends Pets implements petActions{

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "bark!";
    }
}
