package com.qa;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;

import java.util.ArrayList;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        Cat c = new Cat("Whisker", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(c);
        animalList.add(c2);
        animalList.add(d);
        animalList.add(r);
        animalList.add(r2);

        for (int x = 0; x < animalList.size(); x++){
            System.out.println(animalList.get(x));
        }

        //Hashmap
        HashMap<String, Animal> animalMap = new HashMap<>();

        animalMap.put(c.getName(), c);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), r);
        animalMap.put(r2.getName(), r2);

        HashMap<Animal, String> animalMap2 = new HashMap<>();

        animalMap2.put(c, "Fluffy");
        animalMap2.put(c2, "Doesn't like being picked up");
        animalMap2.put(d, "Overly excited about running");
        animalMap2.put(r, "Snuffles a lot, may have a cold");
        animalMap2.put(r2, "May actually be evil. Unsure.");

        for (String )
    }

}