package com.company;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employees
{
    String eName;
    int salary;

    Employees(String eName, int salary)
    {
        this.eName = eName;
        this.salary = salary;
    }
}


public class Function_Type1 {

    public static void main(String [] args)
    {
        ArrayList<Employees> empList = new ArrayList<Employees>();
        empList.add(new Employees("David",50000));
        empList.add(new Employees("Amit",40000));
        empList.add(new Employees("John",30000));
        empList.add(new Employees("Mary",20000));

        Function<Employees, Integer> fn = e ->
        {
            int sal = e.salary;
            if(sal >= 10000 && sal <= 20000)
            {
                return (sal * 10/100);
            }else if(sal > 20000 && sal <= 30000)
            {
                return (sal * 8/100);
            }else if(sal > 30000 && sal <= 50000)
            {
                return (sal * 6/100);
            }else
            {
                return (sal * 4/100);
            }
        };
        Predicate<Integer> p = n -> n > 2000;

        for(Employees emp : empList)
        {
            int bonus = fn.apply(emp);
            if(p.test(bonus)) {
                System.out.println("Employee name : " + emp.eName + " and salary : " + emp.salary);
                System.out.println("Bonus amount is : " + bonus);
            }
        }
    }


}
