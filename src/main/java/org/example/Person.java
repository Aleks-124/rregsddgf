package org.example;

import java.util.ArrayList;

public interface Person {
    ArrayList<Books> getBooks();
    void addBook(Books book);
    String getName();
}
