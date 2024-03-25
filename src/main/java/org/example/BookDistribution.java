package org.example;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Random;

public class BookDistribution {
    ArrayList<Person> persons = new ArrayList<>();
    ArrayList<Person> students = new ArrayList<>();
    ArrayList<Person> teachers = new ArrayList<>();
    Library library;
    Vuz vuz;
    public BookDistribution(Vuz vuz, Library library){
        this.vuz=vuz;
        this.library=library;
        students=vuz.getStudents();
        teachers=vuz.getStudents();
        persons.addAll(vuz.getStudents());
        persons.addAll(vuz.getTeachers());
        for (Person person : persons){
            Random rand = new Random();
            for (int i=0; i< rand.nextInt(8)+2; i++){
                int a = rand.nextInt(library.getBooks().size()-1);
                if (!person.getBooks().contains(library.getBooks().get(a))) {
                    person.addBook((Books) library.getBooks().get(a));
                }
            }
        }
    }
    public ArrayList getStudents() {
        return students;
    }
    public ArrayList getTeachers() {
        return teachers;
    }

}
