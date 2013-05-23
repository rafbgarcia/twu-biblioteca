package com.twu.biblioteca.classes;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.Movie;
import junit.framework.Assert;
import org.junit.Test;

public class PersistenceTest {

    @Test
    public void returnAListOfBooks() {
        Persistence.addBook(new Book("Programming Languages"));
        Persistence.addBook(new Book("How to code"));
        Persistence.addBook(new Book("How to do nothing, easy steps"));

        Assert.assertEquals(3, Persistence.getBooks().size());

        Assert.assertEquals("Programming Languages", Persistence.getBooks().get(0).getName());
        Assert.assertEquals("How to code", Persistence.getBooks().get(1).getName());
        Assert.assertEquals("How to do nothing, easy steps", Persistence.getBooks().get(2).getName());
    }

    @Test
    public void returnAListOfMovies() {
        Persistence.addMovie(new Movie("Test", "Tester", 2000));
        Persistence.addMovie(new Movie("Test", "Tester", 2000));
        Persistence.addMovie(new Movie("Test", "Tester", 2000));

        Assert.assertEquals(3, Persistence.getMovies().size());
    }

}
