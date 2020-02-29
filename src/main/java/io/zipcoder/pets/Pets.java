package io.zipcoder.pets;

abstract public class Pets implements petActions{
    String name;

    public Pets(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { this.name = name; }
}
