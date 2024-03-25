package org.example;

import java.util.ArrayList;

public class Teacher extends Person {
    public String fullName;
    ArrayList<Books> books = new ArrayList<>();
    public Teacher(String fullName){
        this.fullName=fullName;
    }

    @Override
    public ArrayList<Books>  getBooks() {
        return books;
    }
    public void addBook(Books book) {
        books.add(book);
    }
    public String getName() {
        return this.fullName;
    }
}
