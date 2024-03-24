package org.example;

import java.util.ArrayList;

import com.github.javafaker.Faker;

import java.util.Locale;
public class TeacherFabric {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> surnames = new ArrayList<>();
    Faker faker = new Faker(new Locale("ru"));
    public Person createPerson(){
        Teacher teacher = new Teacher(faker.name().nameWithMiddle());
        return teacher;
    }
}
