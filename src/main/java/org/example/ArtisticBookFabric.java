package org.example;

import com.github.javafaker.Faker;

import java.util.Locale;

public class ArtisticBookFabric implements AbstractFabric{
    Faker faker = new Faker(new Locale("ru"));
    @Override
    public Books createRussianBook() {
        RussianArtisticBook russianArtisticBook = new RussianArtisticBook(faker.book().title(),faker.book().author());
        return russianArtisticBook;
    }

    @Override
    public Books createForeignBook() {
        ForeignArtisticBook foreignArtisticBook = new ForeignArtisticBook(faker.book().title(),faker.book().author());
        return foreignArtisticBook;
    }
}
