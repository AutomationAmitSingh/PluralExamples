package com.company;

public class Condition_Loop_Array {

    private float students = 0.0f;
    private float rooms = 4.0f;
    private double val1 = 100.0d;
    private double val2 = 0.0d;
    private double result;
    private char opcode = 'd';

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
        if(opcode == 'a')
        {
          result = val1 + val2;
        }else if(opcode == 's')
        {
        result = val1 - val2;
        }else if(opcode == 'd')
        {
          result = val2 != 0.0d ? val1/val2 : 0.0d;
        }else if(opcode == 'm')
        {
          result = val1 * val2;
        }else
            {
                System.out.println(" Error - Invalid Code");

            }
        System.out.println(result);
        System.out.println("** End Program** ");
   }
}
