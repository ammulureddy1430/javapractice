package abstractclassexample;
abstract class Car
{
    Car()
    {
        System.out.println("Moving on road");
    }
    abstract void run();
    void Gear()
    {
        System.out.println("gear changed");
    }
}
  class Lambo extends Car{  
 void run()
 {
     System.out.println("running safely..");}  
 }  
public class Abstractclassexample {
    public static void main(String[] args) 
    {
        Car c=new Lambo();
        c.run();
        c.Gear();
    }
}
