package com.hm.reskill;

public class Movie implements Comparable<Movie> {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Movie movie) {
        if (movie.getName().length() == this.name.length()) {
            return 0;
        } else if (movie.getName().length() > this.name.length()) {
            return -1;
        } else {
            return 1;
        }
    }
}
