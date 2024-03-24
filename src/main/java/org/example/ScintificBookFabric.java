package org.example;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class ScintificBookFabric implements AbstractFabric{

    Faker faker = new Faker(new Locale("ru"));
    @Override
    public Books createRussianBook() {
        String[] types = {"Учебник", "Пособие", "Задачник"};
        Random rand = new Random();
        RussianScintificBook russianScintificBook = new RussianScintificBook(faker.book().title(), faker.educator().course() ,types[rand.nextInt(2)],faker.book().author());
        return russianScintificBook;
    }

    @Override
    public Books createForeignBook() {
        Random rand = new Random();
        ForeignScintificBook foreignScintificBook = new ForeignScintificBook(faker.book().title(),rand.nextBoolean(),faker.educator().course(),faker.university().name(),faker.book().author());
        return foreignScintificBook;
    }
}
