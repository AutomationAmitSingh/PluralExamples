package com.company;

import java.util.function.Predicate;

public class Predicate_Type3 {

    public static void main(String args [])
    {
        Predicate<Integer> p = i -> (i > 10);
        System.out.println(p.test(20));
        System.out.println(p.test(5));

        Predicate<String> ps = s -> (s.length() > 4);
        System.out.println(ps.test("Welcome"));
        System.out.println(ps.test("xyz"));

        String [] names = {"David", "Scott", "Smith", "John", "Mary"};
        for(String name : names){
            if(ps.test(name))
            {
                System.out.println(name);
            }
        }
    }

}
