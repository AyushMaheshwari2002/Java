// make Thread Using Runnable Interface

class A implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Thread A : " + i);
        }
        System.out.println("Exiting Thread A");
    } 
}

class B implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Thread B : " + i);
        }
        System.out.println("Exiting Thread B");
    }
}

class C implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Thread C : " + i);
        }
        System.out.println("Exiting Thread C");
    }
}

class Main
{
   public static void main(String[] args) 
   {
        A obj1 = new A();
        Thread t1 = new Thread(obj1);

        B obj2 = new B();
        Thread t2 = new Thread(obj2);
            
        C obj3 = new C();
        Thread t3 = new Thread(obj3);
        
        t1.start();
        t2.start();
        t3.start();
    }
}



