package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionParamTest {
    Feline feline;
    public String sex;
    public Boolean hasMane;
    public Boolean exception;

    public LionParamTest(String sex, Boolean hasMane, Boolean exception) {
        this.sex = sex;
        this.hasMane = hasMane;
        this.exception = exception;
    }

    @Parameterized.Parameters(name = "{index}: sex - {0}, hasMane - {1}, exception - {2}")
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{"Самец", true, true},
                new Object[]{"Самка", false, true},
                new Object[]{"Оно", null, false}
        };
    }

    @Test
    public void shouldMaleLionHasMane() {
        try {
            Lion lion = new Lion(sex, feline);
            assertEquals("У льва должна быть грива", hasMane, lion.doesHaveMane());
        } catch (Exception ex) {
            if (exception) {
                fail("Грива не обнаружена");
            }
        }
    }
}
