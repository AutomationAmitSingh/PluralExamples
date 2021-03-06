package com.company;

public class Math_Equation {

    public double leftVal;
    public double rightVal;
    public char opCodes;
    public double result;

    public void execute()
    {
        switch (opCodes)
        {
            case 'a' :
                result = leftVal + rightVal;
                break;
            case 's' :
                result = leftVal - rightVal;
                break;
            case 'd' :
                result = rightVal != 0.0d ? leftVal/rightVal : 0.0d;
                break;
            case 'm' :
                result = leftVal * rightVal;
                break;
            default :
                System.out.println(" Error - Invalid code");
                result = 0.0d;
                break;
        }
    }


}
