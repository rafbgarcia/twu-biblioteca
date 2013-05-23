package com.twu.biblioteca.views;

import com.twu.biblioteca.classes.Persistence;
import com.twu.biblioteca.models.Movie;

public class MovieView {

    public static String showMovies() {
        StringBuilder sb = new StringBuilder();

        sb.append("Movie / Director / Year / Rating\n");
        for (Movie m : Persistence.getMovies()) {
            sb.append(m.getName() + " / " + m.getDirector() + " / " + m.getYear() + " / " + m.getRating() + "\n");
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

}
