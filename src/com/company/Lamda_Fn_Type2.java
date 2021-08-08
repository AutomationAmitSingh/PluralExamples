package com.company;

interface Animal
{
 public void animalLook(String color, String height);
}

/*class Dog implements Animal
        {

            @Override
            public void animalLook(String color, String height) {
                System.out.println("Dog color is: "+color+" and height is: "+height);
            }
        } */

public class Lamda_Fn_Type2 {

    public static void main(String args [])
    {
        //Animal animal = new Dog();
        Animal animal =(color,height)->System.out.println("Dog color is: "+color+" and height is: "+height);
        animal.animalLook("Golden","Two Feet");
    }

}
