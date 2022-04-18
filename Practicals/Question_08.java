/*  8. Create a class “Student” having following instance variables and methods.
       Instance variables: ID, Name, Branch, city and university
       While creating constructors with one, two, three, four and five arguments reuse the constructors by construction chaining.
*/


package com.company;

public class Student_Constructor_Chaining {
    String name;
    long id;
    String branch;
    String city;
    String university;

    Student_Constructor_Chaining(String name, long id, String branch, String city, String university)
    {
        this(name, branch, city, university);
        this.id = id;
    }

    Student_Constructor_Chaining(String name, String branch, String city, String university)
    {
        this(branch, city, university);
        this.name = name;
    }

    Student_Constructor_Chaining(String branch, String city, String university)
    {
        this(city, university);
        this.branch = branch;
    }

    Student_Constructor_Chaining(String city, String university)
    {
        this(university);
        this.city = city;
    }

    Student_Constructor_Chaining(String university)
    {
        this.university = university;
    }

    void showDetails()
    {
        System.out.println("Student Name : " + name);
        System.out.println("Student ID : " + id);
        System.out.println("Branch : " + branch);
        System.out.println("City : " + city);
        System.out.println("University Name : " + university);
    }

    public static void main(String[] args)
    {
        Student_Constructor_Chaining obj = new Student_Constructor_Chaining("Ayush Maheshwari", 20011148, "CSE", "Dehradun", "GEHU");
        obj.showDetails();
    }
}



