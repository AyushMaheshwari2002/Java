//  11. Create a class “Shape” having area() method to calculate area. Overload the area() method for shapes like triangle, rectangle and circle.


package com.company;

public class Shape
{
    double ans;

    // area of triangle
    void area(int length, int breadth, float height)
    {
        ans = length * breadth * height;
    }

    // area of rectangle
    void area(int length, int breadth)
    {
        ans = length * breadth;
    }

    // area of circle
    void area(int radius)
    {
        ans = 3.14 * radius * radius;
    }

    void display()
    {
        System.out.println(ans);
    }

    public static void main(String[] args)
    {
        Shape s = new Shape();

        s.area(32, 12);
        System.out.print("Area of rectangle : ");
        s.display();

        s.area(13, 4, 0.7f);
        System.out.print("Area of triangle : ");
        s.display();

        s.area(7);
        System.out.print("Area of circle : ");
        s.display();
    }
}


