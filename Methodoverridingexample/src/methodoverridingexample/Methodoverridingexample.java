
package methodoverridingexample;
class Car
{
    void drive()
    {
        System.out.println("driving fastly");
    }
}
class Benz extends Car
{
    void drive()
    {
        System.out.println("driving at speed of 80kmph");
    }
}
public class Methodoverridingexample {
    public static void main(String[] args) {
        Benz b=new Benz();
        b.drive();
       
    }
    
}
