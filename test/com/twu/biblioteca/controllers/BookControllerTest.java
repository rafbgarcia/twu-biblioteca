package com.twu.biblioteca.controllers;

import com.twu.biblioteca.classes.Persistence;
import com.twu.biblioteca.models.Book;
import junit.framework.Assert;
import org.junit.Test;

public class BookControllerTest {

    @Test
    public void reservesABook() {
        Persistence.addBook(new Book("Programming L."));
        Persistence.addBook(new Book("Programming La."));
        Persistence.addBook(new Book("Programming Lan."));


        Assert.assertFalse(BookController.isBookReserved(0));
        Assert.assertFalse(BookController.isBookReserved(1));
        Assert.assertFalse(BookController.isBookReserved(2));

        BookController.reserve(0);
        Assert.assertTrue(BookController.isBookReserved(0));
        Assert.assertFalse(BookController.isBookReserved(1));
        Assert.assertFalse(BookController.isBookReserved(2));
    }


}
