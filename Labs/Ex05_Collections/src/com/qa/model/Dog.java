package com.qa.model;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    //toString
    @Override
    public String toString() {
        return "Dog: " + super.toString();
    }

    @Override
    public String sayHello(){
        return "Oh hello! You're back1 Hello! Hello!" +
                "I missed you! Hello!";
    }

    @Override
    public String move(){
        return "Ruuuuuun!";
    }
}
