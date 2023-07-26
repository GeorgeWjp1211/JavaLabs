package com.qa.model;

public class Rabbit extends Animal{
    public Rabbit(String name, int age) {
        super(name, age);
    }

    //toString

    @Override
    public String toString() {
        return "Rabbit: " + super.toString();
    }

    @Override
    public String sayHello(){
        return "Snuffle snuffle";
    }

    @Override
    public String move(){
        return "Hop hop hop";
    }
}
