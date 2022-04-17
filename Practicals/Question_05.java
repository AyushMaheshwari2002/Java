/* 5. Create a class “Student” having following instance variables and methods.
      Instance variables: ID, Name, Branch and university
      Method: setDetails() and showDetails().
      The setDetails() method sets the values of ID, Name, Branch and University.
      And showDetails() method shows the value of each field.
      Note : use of static keyword
*/



package com.company;

public class Student_Details_Using_Static
{
    String name;
    long id;
    String branch;
    static String university = "GEHU";

    void setDetails(String name, long id, String branch)
    {
        this.name = name;
        this.id = id;
        this.branch = branch;
    }

    void showDetails()
    {
        System.out.println("Student Name : " + name);
        System.out.println("Student ID : " + id);
        System.out.println("Branch : " + branch);
        System.out.println("University Name : " + university);
    }

    public static void main(String[] args)
    {
        Student_Details_Using_Static obj = new Student_Details_Using_Static();
        obj.setDetails("Ayush Maheshwari", 20011148, "CSE");
        obj.showDetails();
    }
}


