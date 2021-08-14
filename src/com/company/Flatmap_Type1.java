package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap_Type1 {

    public static void main(String [] args) {

        List<String> teamA = Arrays.asList("Virat", "KL", "Rohit");
        List<String> teamB = Arrays.asList("Pant", "Hardik", "Dhawan");
        List<String> teamC = Arrays.asList("Iyer", "Shaw", "Ishan");

        List<List<String>> wcTeam = new ArrayList<List<String>>();
        wcTeam.add(teamA);
        wcTeam.add(teamB);
        wcTeam.add(teamC);
        // Before Java 8
        for (List<String> team : wcTeam) {

            for(String name : team)
            {
                System.out.println(name);
            }

        }

        // using Streams Flatmap()
        List<String> names = wcTeam.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
        System.out.println(names);

    }
}
