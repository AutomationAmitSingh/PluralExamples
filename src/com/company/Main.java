package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(" A Simple Java Program");

        // Data type casting class calling below using reference

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

        // Conditional loop array class calling using reference

        Condition_Loop_Array conditionLoopArray = new Condition_Loop_Array();
        conditionLoopArray.simpleIfCondition();
        conditionLoopArray.conditionWhileLoop();
        conditionLoopArray.conditionDoWhileloop();
        conditionLoopArray.conditionForLoop();
        conditionLoopArray.conditionArrays();
        conditionLoopArray.conditonForEachLoop();
        conditionLoopArray.condtionSwitchCase();

        // Array used in the class calling by reference

        Just_By_Array justByArray = new Just_By_Array();
        justByArray.calculatingArrayValues();
        justByArray.calculatingSwitchArray();

        // Class creation and calling

        Flight flight = new Flight();
        flight.addPassengers();
        System.out.println(" Number of passengers in the flight : " +flight.passengers);
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        flight2.addPassengers();
        System.out.println(" Number of passengers in the flight21 : " +flight2.passengers);
        flight2 = flight1;
        System.out.println(" Number of passengers in the flight2 : " +flight2.passengers);
        flight1.addPassengers();
        flight1.addPassengers();
        System.out.println(" Number of passengers in the flight2 : " +flight2.passengers);
        flight.showSum(7.5f,1.4f,1);




    }
}
