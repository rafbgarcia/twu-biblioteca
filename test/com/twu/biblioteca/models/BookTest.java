package com.twu.biblioteca.models;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {

    @Test
    public void aBookIsCreatedPassingItsNameToConstructor() {
        Book book = new Book("Programming languages");
        Assert.assertTrue(book instanceof Book);
    }

    @Test
    public void aBookCanBeMarkedAsReserved() {
        Book book = new Book("Programming languages");
        Assert.assertFalse(book.isReserved());

        book.setReserved(true);
        Assert.assertTrue(book.isReserved());
    }

}
