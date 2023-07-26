package com.qa.model;

public class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }

    //toString
    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }

    @Override
    public String sayHello(){
        return "Oh. It's you. Hello" + getName();
    }

    @Override
    public String move(){
        return "If you insist...";
    }

}
