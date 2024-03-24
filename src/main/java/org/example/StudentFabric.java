package org.example;

import java.util.ArrayList;

import com.github.javafaker.Faker;

import java.util.Locale;
public class StudentFabric {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> surnames = new ArrayList<>();
    Faker faker = new Faker(new Locale("ru"));
    public Person createPerson(){
        Student student = new Student(faker.name().firstName(),faker.name().lastName());
        return student;
    }
}
