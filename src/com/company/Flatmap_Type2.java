package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
   String sName;
   int id;
   char grade;

   Student(String sName, int id, char grade){
      this.sName = sName;
      this.id = id;
      this.grade = grade;
   }
}

public class Flatmap_Type2 {

   public static void main (String [] args)
   {
      List<Student> studentList1 = new ArrayList<Student>();
      studentList1.add(new Student("Virat",101,'A'));
      studentList1.add(new Student("Siraj",102,'B'));
      studentList1.add(new Student("Parthiv",103,'C'));

      List<Student> studentList2 = new ArrayList<Student>();
      studentList2.add(new Student("Rohit",104,'A'));
      studentList2.add(new Student("Shami",105,'B'));
      studentList2.add(new Student("Chand",106,'C'));

      List<List<Student>> sAll = Arrays.asList(studentList1,studentList2);
      // before java 8
      for(List<Student> sl : sAll)
      {
        for(Student stu : sl)
        {
          if(stu.grade == 'A')
          {
             System.out.println(stu.sName+" "+stu.id);
          }
        }
      }

      //using streams flatmap
       List<String> names = sAll.stream().flatMap(sl -> sl.stream()).filter(s -> s.grade == 'A').map(s -> s.sName).collect(Collectors.toList());
      System.out.println(names);

   }
}
