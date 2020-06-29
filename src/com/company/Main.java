package com.company;

public class Main extends Super {
	
	public Main(int index) {
		// TODO Auto-generated constructor stub
		index = index;
	}

    public static void main(String[] args) {
	// write your code here
        System.out.println(" A Simple Java Program");
        
        TestApp app = new TestApp();
        System.out.println(app.x + " " + app.y);
        System.out.println(" Temporary uncommited chnages");

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

        // Math Equation class calling by reference

        Math_Equation[] math_equations = new Math_Equation[4];
        math_equations[0] = create( 100.0d, 50.0d, 'd');
        math_equations[1] = create( 25.0d, 92.0d, 'a');
        math_equations[2] = create( 225.0d, 17.0d, 's');
        math_equations[3] = create( 11.0d, 3.0d, 'm');

        for ( Math_Equation equation: math_equations) {

            equation.execute();
            System.out.print(" Through math equation result = ");
            System.out.println(equation.result);
        }

        // Using setter (Mutator) getter (Accessors)

        /*With_Setter_Getter with_setter_getter = new With_Setter_Getter();
        with_setter_getter.execute();
        System.out.print(" Test = ");
        System.out.println(with_setter_getter.getResult());*/

        With_Setter_Getter[] with_setter_getters = new With_Setter_Getter[4];
        with_setter_getters[0] = makeIt(100.0d, 50.0d, 'd');
        with_setter_getters[1] = makeIt(25.0d, 92.0d, 'a');
        with_setter_getters[2] = makeIt(225.0d, 17.0d, 's');
        with_setter_getters[3] = makeIt(11.0d, 3.0d, 'm');

        for ( With_Setter_Getter with_setter_getter: with_setter_getters) {

            with_setter_getter.execute();
            System.out.print(" Through setter getter result = ");
            System.out.println(with_setter_getter.getResult());
        }

    // Method with constructor to execute need to comment makeItConstructor() method

    With_Constructor[] with_constructors = new With_Constructor[4];
    /*with_constructors[0] = new With_Constructor(100.0d, 50.0d, 'd');
    with_constructors[1] = new With_Constructor(25.0d, 92.0d, 'a');
    with_constructors[2] = new With_Constructor(225.0d, 17.0d, 's');
    with_constructors[3] = new With_Constructor(11.0d, 3.0d, 'm');

        for( With_Constructor with_constructor: with_constructors) {

        with_constructor.execute();
        System.out.print(" Through constructor result = ");
        System.out.println(with_constructor.getResult());
    }*/

        with_constructors[0] = makeItConstructor(100.0d, 50.0d, 'd');
        with_constructors[1] = makeItConstructor(25.0d, 92.0d, 'a');
        with_constructors[2] = makeItConstructor(225.0d, 17.0d, 's');
        with_constructors[3] = makeItConstructor(11.0d, 3.0d, 'm');

        for( With_Constructor with_constructor: with_constructors) {

            with_constructor.execute();
            System.out.print(" Through constructor result = ");
            System.out.println(with_constructor.getResult());
        }
        
        Main myMain = new Main(10);
        System.out.println(" Will print Super class value : "+myMain.index);
        System.out.println(" Entered text at line 124");
        System.out.println(" Entered text at line 125");


    }


    public static Math_Equation create( double leftVal, double rightVal, char opCode)
    {
        Math_Equation math_equation = new Math_Equation();
        math_equation.leftVal = leftVal;
        math_equation.rightVal = rightVal;
        math_equation.opCodes = opCode;

        return math_equation;
    }

    public static With_Setter_Getter makeIt( double leftVal, double rightVal, char opCode)
    {
        With_Setter_Getter with_setter_getter = new With_Setter_Getter();
        with_setter_getter.setLeftVal(leftVal);
        with_setter_getter.setRightVal(rightVal);
        with_setter_getter.setOpCodes(opCode);

        return with_setter_getter;
    }


    public static With_Constructor makeItConstructor(double leftVal, double rightVal, char opCode)
    {
        With_Constructor with_constructors = new With_Constructor();
        with_constructors.setLeftVal(leftVal);
        with_constructors.setRightVal(rightVal);
        with_constructors.setOpCodes(opCode);

        return with_constructors;
    }



}
