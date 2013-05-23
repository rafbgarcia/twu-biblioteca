package com.twu.biblioteca.classes;


import com.intellij.execution.testframework.sm.runner.ui.TestsPresentationUtil;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MenuTest {

    // A customer should see a list of menu options at the start of the application.
    @Test
    public void showsTheOptions() {
        StringBuilder content = new StringBuilder();
        content.append("Please, choose one of the options below:\n");
        content.append("1 - List of books\n");
        content.append("2 - List of movies\n");
        content.append("3 - Reserve a book\n");
        content.append("4 - Membership details\n");
        content.append("9 - Quit\n");

        assertEquals(content.toString(), Menu.getOptions());
    }

    // A customer should be able to select a menu option.
    @Test
    public void returnsTrueIfSelectedOptionIsOneOrTwoOrThreeAndFalseOtherwise() {
        assertFalse(Menu.isValidOption(0));
        assertFalse(Menu.isValidOption(6));
        assertTrue(Menu.isValidOption(1));
        assertTrue(Menu.isValidOption(2));
        assertTrue(Menu.isValidOption(3));
        assertTrue(Menu.isValidOption(4));
        assertTrue(Menu.isValidOption(5));
    }

    // A customer should be notified when they do not select a valid option with “Select a valid option!!”
    @Test
    public void returnsAMessageIfTheSelectedOptionIsInvalid() {
        Assert.assertEquals("Select a valid option!!", Menu.getInvalidOptionMessage());
    }

    @Test
    public void returnsTrueOnlyIfOptionIsFour() {
        assertTrue(Menu.isQuitOption(9));
    }

}
