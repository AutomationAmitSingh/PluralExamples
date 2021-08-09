package com.company;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate_Type2 {

    public static void main(String [] args)
    {
       Employee employee = new Employee("Amit Singh", 50000, 8);
        Predicate<Employee> pe = e -> (e.salary > 40000 && e.experience > 5);
        System.out.println(pe.test(employee));

        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("David Warner",70000, 7));
        emp.add(new Employee("Tim Pane",60000, 6));
        emp.add(new Employee("KL Rahul",50000, 5));
        emp.add(new Employee("Joe Root",40000, 4));

        for(Employee e : emp)
        {
            if(pe.test(e))
            {
                System.out.println(e.eName+" "+e.experience+" "+e.salary);
            }
        }
    }

}

class Employee
{
    String eName;
    int salary;
    int experience;

    Employee(String name, int sal, int exp)
    {
       eName = name;
       salary = sal;
       experience = exp;
    }
}
