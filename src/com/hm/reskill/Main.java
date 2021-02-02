package com.hm.reskill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Rick and Morty"));
        movies.add(new Movie("South Park"));
        movies.add(new Movie( "The Mandalorian"));
        movies.add(new Movie( "Breaking Bad"));
        movies.add(new Movie( "Altered Carbon"));

        String res = getShortestString(movies);

        System.out.println("Shortest movie title is: " + res);
        System.out.println("***********");

        List<Movie> newList = getSortedList(movies);

        for (Movie m: newList) {
            System.out.println(m.getName());
        }
        System.out.println("***********");
    }

    public static List<Movie> getSortedList(List<Movie> list) {
        Collections.sort(list);

        return list;
    }

    public static String getShortestString(List<Movie> list) {
        int size = Integer.MAX_VALUE;
        String result = "";

        for (Movie movie: list) {
            if (movie.getName().length() < size) {
                size = movie.getName().length();
                result = movie.getName();
            }
        }

        return result;
    }
}
