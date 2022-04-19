/*  12. Create a class “Bank” having method getRateOfInterest(). Create child classes as HDFC, SBI and PNB and override getRateOfInterest()
        and return interest rates as 4.0, 4.5 and 5% correspondingly.
        Use concept of Upcasting to implement this scenario.
*/


package com.company;

class Bank
{
    float GetROI()
    {
        return 0f;
    }
}

class HDFC extends Bank
{
    float GetROI()
    {
        return 4f;
    }
}

class PNB extends Bank
{
    float GetROI()
    {
        return 4.5f;
    }
}

class SBI extends Bank
{
    float GetROI()
    {
        return 5f;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Bank b1 = new HDFC();
        System.out.println(b1.GetROI());
        
        Bank b2 = new PNB();
        System.out.println(b2.GetROI());
        
        Bank b3 = new SBI();
        System.out.println(b3.GetROI());
    }
}


