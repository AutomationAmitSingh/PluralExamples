package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(" A Simple Java Program");
        Data_Types_Casting dataTypesCasting = new Data_Types_Casting();
        System.out.println(" Getting the result 1 : "+dataTypesCasting.getResult1());
        System.out.println(" Getting the result 2 : "+dataTypesCasting.getResult2());
        System.out.println(" Getting the result 3 : "+dataTypesCasting.getResult3());
        System.out.println(" Getting the result 4 : "+dataTypesCasting.getResult4());
        System.out.println(" Getting the result for byte to short conversion : "+dataTypesCasting.getByteToShort());
        System.out.println(" Getting the result for short conversion : "+dataTypesCasting.getToShort());
        System.out.println(" Getting the result for double conversion : "+dataTypesCasting.getToDouble());
        System.out.println(" Getting the result for long conversion : "+dataTypesCasting.getToLong());
        System.out.println("Amit Successfully completed java program from IntelliJ via GitHub to Jenkins");
        Condition_Loop_Array conditionLoopArray = new Condition_Loop_Array();
        conditionLoopArray.simpleIfCondition();
        conditionLoopArray.conditionWhileLoop();
        conditionLoopArray.conditionDoWhileloop();

    }
}
