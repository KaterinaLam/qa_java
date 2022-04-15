package com.example;

import java.util.List;

public class Cat extends Feline {

    Predator predator;

    public Cat(Feline feline) {

    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return eatMeat();
    }

}
