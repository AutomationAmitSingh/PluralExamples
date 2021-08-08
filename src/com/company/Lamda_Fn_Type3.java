package com.company;

@FunctionalInterface
interface Human
{
    public String Gender(String color, String height);
}


/* class Boy implements Human
{

    @Override
    public String Gender(String color, String height) {
        System.out.println("Boy having color: "+color+" and height is: "+height);
        return ("Age is 28 years");
    }
}*/


public class Lamda_Fn_Type3 {

     public static void main(String [] args)
     {
      //Human human = new Boy();
        Human human =(color,height)->{System.out.println("Boy having color: "+color+" and height is: "+height);
           return ("Age is 28 years");};
      human.Gender("Fair","Five Feet");
      System.out.println(human.Gender("Fair","Five Feet"));
     }

}
