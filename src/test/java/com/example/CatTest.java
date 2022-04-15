package com.example;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    /**
     * Кошка должна мяукать.
     */
    @Test
    public void getSoundReturnCorrectVoice() {
        Cat cat = new Cat(new Feline());
        String expected = "Мяу";
        String actual=cat.getSound();
        assertEquals(expected,actual);
    }

    /**
     * Кошка должна кушать.
     */
    @Test
    public void shouldCatHasFoodList() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = cat.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }
}