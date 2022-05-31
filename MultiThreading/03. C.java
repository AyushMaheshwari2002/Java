// Set Priorities of Threads

class A implements Runnable
{
   public void run()
   {
         for(int i=1;i<=5;i++)
         {
            System.out.println("Thread  A "+i);
         }        
      System.out.println("Exiting A ");
           
   }
}
class B implements Runnable
   {
   public void run()
   {
       for(int i=1;i<=5;i++)
         {
            System.out.println("Thread  B "+i);
         }
      System.out.println("Exiting B "); 
   }
}
class C implements Runnable
{
   public void run()
   {
      for(int i=1;i<=5;i++)
         {
            System.out.println("Thread  C "+i);
         }
      System.out.println("Exiting C ");
   }
}
class Main
{
   public static void main(String args[])
   {
      A obj1 = new A();
      Thread t1 = new Thread(obj1);
      
      B obj2 = new B();
      Thread t2 = new Thread(obj2);
      
      C obj3 = new C();
      Thread t3 = new Thread(obj3);
    
      System.out.println("Default Priorities : ");
      System.out.println("Priority of A = " + t1.getPriority());
      System.out.println("Priority of B = " + t2.getPriority());
      System.out.println("Priority of C = " + t3.getPriority());
     
      t1.setPriority(9);
      t2.setPriority(2);
      t3.setPriority(6);
      
      System.out.println("\nAfter Changing Priorities : ");
      System.out.println("Priority of A = " + t1.getPriority());
      System.out.println("Priority of B = " + t2.getPriority());
      System.out.println("Priority of C = " + t3.getPriority());
      System.out.println();
 
      t1.start(); 
      t2.start(); 
      t3.start();
          
    } 
}
