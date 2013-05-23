package com.twu.biblioteca.views;

import com.twu.biblioteca.classes.Persistence;
import com.twu.biblioteca.models.Movie;
import junit.framework.Assert;
import org.junit.Test;

public class MovieViewTest {

    @Test
    public void showsAListOfMovies() {
        Persistence.addMovie(new Movie("Test", "Tester", 2012));
        Persistence.addMovie(new Movie("Test2", "Tester2", 2013));

        StringBuilder sb = new StringBuilder();
        sb.append("Movie / Director / Year / Rating\n");
        sb.append("Test / Tester / 2012 / N/A\n");
        sb.append("Test2 / Tester2 / 2013 / N/A\n");

        Assert.assertEquals(sb.toString(), MovieView.showMovies());
    }
}
