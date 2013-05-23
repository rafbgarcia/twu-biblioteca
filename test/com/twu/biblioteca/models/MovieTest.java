package com.twu.biblioteca.models;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovieTest {

    private Movie m;
    private Movie m2;

    @Before
    public void setUp() {
        m = new Movie("Spider-man", "Stiv Spilb", 2004);
        m2 = new Movie("Spider-man", "Stiv Spilb", 2012);
    }

    @Test
    public void movieIsCreatedByPassingItsNameAndDirectorAndYear(){
        Assert.assertTrue(m instanceof Movie);
    }

    @Test
    public void ratingIsNAIfMovieIsEarlierThan2010() {
        Assert.assertFalse(m.getRating().equals("N/A"));
        Assert.assertEquals("N/A", m2.getRating());
    }

}
