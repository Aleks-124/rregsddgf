package org.example;

import java.util.ArrayList;

public class Student extends Person{
    public String name;
    public String lastname;
    ArrayList<Books> books = new ArrayList<>();

    public Student(String name, String lastname){
        this.name=name;
        this.lastname=lastname;
    }
    @Override
    public ArrayList<Books> getBooks() {
        return books;
    }

    @Override
    public String getName() {
        return this.name+" "+this.lastname;
    }
    public void addBook(Books book) {
        books.add(book);
    }



}
