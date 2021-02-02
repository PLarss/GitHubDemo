package com.hm.reskill;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> list = new ArrayList<>();

        list.add("Rick and Morty");
        list.add("South Park");
        list.add("The Mandalorian");
        list.add("Breaking Bad");
        list.add("Altered Carbon");

        String res = getShortestString(list);

        System.out.println(res);

    }

    public static String getShortestString(List<String> list) {
        int size = Integer.MAX_VALUE;
        String result = "";

        for (String s: list) {
            if (s.length() < size) {
                size = s.length();
                result = s;
            }
        }

        return result;
    }
}
