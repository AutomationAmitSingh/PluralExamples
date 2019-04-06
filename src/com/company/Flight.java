package com.company;

public class Flight {

    int passengers;
    int seats;

    public Flight()
    {
        seats = 150;
        passengers = 0;
    }

    public void addPassengers()
    {
        if ( passengers < seats)
        {
            passengers += 1;
        }
    }

    private void handleTooMany ()
    {
        System.out.println(" Too many ");
    }

    public void showSum( float x, float y, int count)
    {
        if ( count < 1)
        {
            System.out.println(" I am back ");
            return;
        }
        float sum = x + y;

        for( int i = 0; i < count; i++)
        {
            System.out.println(" Sum is : " + sum);
        }

        return;
    }
}
