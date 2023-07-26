package com.qa;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Whisker", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(c);
        animalList.add(c2);
        animalList.add(d);
        animalList.add(r);
        animalList.add(r2);

        for (int x = 0; x < animalList.size(); x++){
            System.out.println(animalList.get(x));
        }

        //HashMaps
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
        animalMap2.put(r, "Snuffles a lot, might have a cold");
        animalMap2.put(r2, "May actually be evil. Unsure.");

        for (String key : animalMap.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    animalMap.get(key));
        }

        //Set
        HashSet<Animal> set = new HashSet<>();
        set.addAll(animalList);

        set.add(c); //replace the previous version of cat
        set.add(c2);

        Iterator<Animal> iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //Ex5-3 Task1
        System.out.println("Finding Spot.");
        for (Animal a : animalList){
            if (a.getName().equals("Spot")){
                System.out.println("Fount spot in ArrayList: " + a);
            }
        }

        //for a hashmap
        System.out.println("Found Spot in HashMap: " +
                animalMap.get("Spot"));

        //Task2
        Collections.sort(animalList);
        System.out.println("Sorted animal list");
        for (int x = 0; x < animalList.size(); x++){
            System.out.println(animalList.get(x));
        }

        //Task3
        TreeMap<String, Animal> tree = new TreeMap<>();
        tree.putAll(animalMap);

        System.out.println("TreeMap");
        for (String key : tree.keySet()){
            System.out.println("Key: " + key + " Value: " + tree.get(key));
        }

    }
}
