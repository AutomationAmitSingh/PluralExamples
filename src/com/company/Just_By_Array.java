package com.company;

public class Just_By_Array {

    private double [] leftValue = { 100.0d , 200.0d , 300.0d , 400.0d  };
    private double [] rightValue = { 60.0d , 70.0d , 80.0d , 90.0d };
    private char [] opCodes = { 'a' , 's' , 'm' , 'd' };
    private double [] result = new double[opCodes.length];

    public Just_By_Array ()
    {

    }

    public void calculatingArrayValues()
    {
        for(int i = 0; i<opCodes.length; i++)
        {
          if(opCodes[i] == 'a')
          {
              result[i] = leftValue[i] + rightValue[i];
              System.out.println(" The addition result : "+result[i]);
          }

          else if(opCodes[i] == 's')
            {
                result[i] = leftValue[i] - rightValue[i];
                System.out.println(" The subtraction result : "+result[i]);
            }

          else if(opCodes[i] == 'd')
          {
              result[i] = rightValue[i] != 0.0d ? leftValue[i]/rightValue[i] : 0.0d;
              System.out.println(" The division result : "+result[i]);
          }

          else if(opCodes[i] == 'm')
          {
            result[i] = leftValue[i] * rightValue[i];
              System.out.println(" The multiplication result : "+result[i]);
          }

          else
              {
                  System.out.println(" Error - invalid operation code");
                  result[i] = 0.0d;
              }




        }

        for (double eachResult: result) {
            System.out.print(" The result : ");
            System.out.println(eachResult);
        }
    }

    public void calculatingSwitchArray ()
    {
        for ( int i = 0; i < opCodes.length; i++)
        {
           switch (opCodes[i])
           {
               case 'a' :
                   result[i] = leftValue[i] + rightValue[i];
                   break;
               case 's' :
                   result[i] = leftValue[i] - rightValue[i];
                   break;
               case 'd' :
                   result[i] = rightValue[i] != 0.0d ? leftValue[i]/rightValue[i] : 0.0d;
                   break;
               case 'm' :
                   result[i] = leftValue[i] * rightValue[i];
                   break;
                   default :
                       System.out.println(" Error - Invalid code");
                       result[i] = 0.0d;
                       break;
           }

        }

        for (double eachResult: result) {
            System.out.print(" The result : ");
            System.out.println(eachResult);
        }
    }
 }
