package com.company;

import java.util.function.Predicate;

// Joining predicates - and or negate

public class Predicate_Type1 {

    public static void main(String [] args)
    {
      int [] numbers = {19, 28, 37, 46, 55, 91, 82, 73, 64};
        Predicate<Integer> even = i -> i % 2 == 0;
        Predicate<Integer> gtFifty = i -> i > 50;
        //and
        System.out.println("Following numbers are even and greater than 50...!");

        for(int number : numbers)
        {
          if(even.and(gtFifty).test(number))   // if(even.test(n) && gtFifty.test(n))
          {
            System.out.println(number);
          }
        }
        //or
        System.out.println("Following numbers are even or greater than 50...!");
        for(int number : numbers)
        {
            if(even.or(gtFifty).test(number))  // if(even.test(n) || gtFifty.test(n))
            {
                System.out.println(number);
            }
        }
        //negate
        System.out.println("Following numbers are opposite of greater than 50...!");
        for(int number : numbers)
        {
          if(gtFifty.negate().test(number))
          {
              System.out.println(number);
          }
        }
    }

}
