/* 1. Create a class “Student” having following instance variables and methods.
      Instance variables: ID, Name, Branch and university
      Method: setDetails() and showDetails().
      The setDetails() method sets the values of ID, Name, Branch and University.
      And showDetails() method shows the value of each field.
*/

package com.company;

public class Student {
    String name;
    long id;
    String branch;
    String university;

    void setDetails(String name, long id, String branch, String university)
    {
        this.name = name;
        this.id = id;
        this.branch = branch;
        this.university = university;
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
        Student obj = new Student();
        obj.setDetails("Ayush Maheshwari", 20011148, "CSE", "GEHU");
        obj.showDetails();
    }
}


