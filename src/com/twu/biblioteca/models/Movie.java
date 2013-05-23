package com.twu.biblioteca.models;

public class Movie {
    private String name;
    private String director;
    private int year;
    private String rating;

    public Movie(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;

        if(year >= 2010)
            this.rating = "N/A";
        else
            this.rating = Integer.toString((int) (Math.random() * 10));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
