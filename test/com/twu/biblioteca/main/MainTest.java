package com.twu.biblioteca.main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {

    // A customer should see a welcome message when they start the application.
    @Test
    public void showsAWelcomeMessage() {
        assertEquals("Welcome!\n\n", Main.getWelcomeMessage());
    }


}
