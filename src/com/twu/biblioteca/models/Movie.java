package com.twu.biblioteca.models;

import java.util.Random;

public class Movie {
    private String name;
    private String director;
    private int year;
    private String rating;

    public Movie(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;

        double rat;
        if(year >= 2010) {
            this.rating = "N/A";
        } else {
            rat = Math.random() * (10 - 0);
            Random rand;
            rand.nextInt(10);
            this.rating = rat.toString();
        }
    }
}
