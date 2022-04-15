package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    // У хищника должна быть еда
    @Test
    public void felineShouldHaveFood() throws Exception {
        Assert.assertTrue(
                "Список еды для хищника должен быть заполнен.",
                new Feline().getFood("Хищник").size() > 0
        );
    }

    //Хищник ест мясо
    @Test
    public void felineShouldEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = feline.getFood("Хищник");
        assertEquals(expectedEatMeat, actualEatMeat);
    }


    //Семейство Кошачьи
    @Test
    public void felineShouldHaveFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    //Есть котятки
    @Test
    public void felineShouldHaveKittens() {
        Feline feline = new Feline();
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        Assert.assertEquals(expectedKittens, actualKittens);
    }

}