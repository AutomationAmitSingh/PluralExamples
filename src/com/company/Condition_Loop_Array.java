package com.company;

public class Condition_Loop_Array {

    private float students = 0.0f;
    private float rooms = 4.0f;

    public Condition_Loop_Array()
    {

    }

    public void simpleIfCondition()
    {
        if(students>0.0f)
        {
         if(rooms>4.0f)
             System.out.println(students/rooms);
        }else
            {
                System.out.println(" No Students");
            }
        System.out.println("** End Program** ");
   }
}
