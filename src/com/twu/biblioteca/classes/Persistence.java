package com.twu.biblioteca.classes;

import com.twu.biblioteca.models.Book;

import java.util.ArrayList;

public class Persistence {
    private static ArrayList<Book> books = new ArrayList<Book>();

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static void addBook(Book book) {
        Persistence.books.add(book);
    }

    public static Book getBookAt(int index) throws IndexOutOfBoundsException {
        return Persistence.getBooks().get(index);
    }

}
