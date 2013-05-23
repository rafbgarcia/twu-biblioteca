package com.twu.biblioteca.models;

import junit.framework.Assert;
import org.junit.Test;

public class MovieTest {


    @Test
    public void aMovieIsCreatedByPassingItsNameAndDirectorAndYear(){
        Movie m = new Movie("Spider-man", "Stiv Spilb", 2004);
    }

}
