package com.twu.biblioteca.classes;

import com.twu.biblioteca.models.Book;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersistenceTest {

    @Before
    public void setUp() {
        Persistence.addBook(new Book("Programming Languages"));
        Persistence.addBook(new Book("How to code"));
        Persistence.addBook(new Book("How to do nothing, easy steps"));
    }

    @Test
    public void returnAListOfBooks() {
        Assert.assertEquals(3, Persistence.getBooks().size());

        Assert.assertEquals("Programming Languages", Persistence.getBooks().get(0).getName());
        Assert.assertEquals("How to code", Persistence.getBooks().get(1).getName());
        Assert.assertEquals("How to do nothing, easy steps", Persistence.getBooks().get(2).getName());
    }

}
