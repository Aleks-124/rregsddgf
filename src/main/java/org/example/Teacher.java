package org.example;

import java.util.ArrayList;

public class Teacher implements Person {
    public String fullName;
    ArrayList<Books> books = new ArrayList<>();
    public Teacher(String fullName){
        this.fullName=fullName;
    }

    @Override
    public ArrayList getBooks() {
        return books;
    }

    public void addBook(Books book) {
        books.add(book);
    }
    public String getName() {
        return this.fullName;
    }
}
