package com.company;

public class Data_Types_Casting {

    private int valA;
    private int valB;
    private int valC;
    private int valD;
    private int result1;
    private int result2;
    private int result3;
    private int result4;
    private float floatVal;
    private double doubleVal;
    private byte byteVal;
    private short shortVal;
    private long longVal;
    private short byteToShort;
    private short toShort;
    private double toDouble;
    private long toLong;

    public Data_Types_Casting()
    {
        this.valA = 21;
        this.valB = 6;
        this.valC = 3;
        this.valD = 1;
        this.floatVal = 1.0f;
        this.doubleVal = 4.0d;
        this.byteVal = 7;
        this.shortVal = 7;
        this.longVal = 5;
    }

    public int getResult1()
    {
        return result1 = valA - valB / valC;
    }

    public int getResult2()
    {
        return result2 = ( valA - valB ) / valC;
    }

    public int getResult3()
    {
        return result3 = valA / valC * valD + valB;
    }

    public int getResult4()
    {
        return result4 = valA / ( valC * ( valD + valB ));
    }

    public short getByteToShort()
    {
        return ( short )byteVal;
    }

    public short getToShort()
    {
        return ( short )( byteVal - longVal );
    }

    public double getToDouble()
    {
        return longVal - doubleVal;
    }

    public long getToLong()
    {
        return ( long )( shortVal - longVal + floatVal + doubleVal );
    }
}
