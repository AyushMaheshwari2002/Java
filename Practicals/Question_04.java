/* 4. Create class Employee with following attributes and methods
      ID, name, department and salary.
      The setDetails() method sets the values of ID, name, department and salary.
      And showDetails() method shows the value of each field.
      Note: (i) Values must be entered through Scanner class.
            (ii) Use proper constructor
            (iii) Use “this” reference variable to avoid ambiguity.
*/


package com.company;
import java.util.Scanner;

public class Employee {
    int id;
    String name;
    String department;
    int salary;

    // USING CONSTRUCTOR
    Employee() {

    }

    Employee(int id, String name, String department, int salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // USING SCANNER CLASS
    void setDetails(int id, String name, String department, int salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void showDetails()
    {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Department : " + department);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Department : ");
        String department = sc.next();

        System.out.print("Enter Employee Salary : ");
        int salary = sc.nextInt();

        Employee e1 = new Employee();
        e1.setDetails(id, name, department, salary);
        System.out.println("\nDetails through Scanner Class :-");
        e1.showDetails();

        Employee e2 = new Employee(234567, "Ayush Maheshwari", "Google", 2000000);
        System.out.println("\nDetails using Constructor :-");
        e2.showDetails();
    }
}


