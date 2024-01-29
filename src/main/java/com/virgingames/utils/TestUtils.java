package com.virgingames.utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class TestUtils {

    public static String generateFirstName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static void main(String[] args) {
        System.out.println(generateFirstName());
    }


    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }
}
