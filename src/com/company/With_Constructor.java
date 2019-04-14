package com.company;

public class With_Constructor {

    public double leftVal;
    public double rightVal;
    public char opCodes;
    public double result;

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setOpCodes(char opCodes) {
        this.opCodes = opCodes;
    }

    public double getResult()
    {
        return result;
    }

    public With_Constructor(char opCodes)
    {
      this.opCodes = opCodes;
    }

    public With_Constructor()
    {

    }

    public With_Constructor(double leftVal, double rightVal, char opCodes)
    {
      this(opCodes);
      this.leftVal = leftVal;
      this.rightVal = rightVal;

    }

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
