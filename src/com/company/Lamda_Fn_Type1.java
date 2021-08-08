package com.company;

@FunctionalInterface
interface Cab
{
    public void bookCab();
}

/*class Ola implements Cab
{
    @Override
    public void bookCab() {
        System.out.println("Ola cab booked successfully");
    }
}*/

public class Lamda_Fn_Type1 {

    public static void main(String [] args)
    {
       //Ola ola = new Ola();  //type1 of calling
        //Cab cab = new Ola(); //type2 of calling
       //ola.bookCab();
       // cab.bookCab();

        // using lamda function by using functional interface
        Cab cab =()->System.out.println("Ola cab booked successfully");
        cab.bookCab();
    }
}
