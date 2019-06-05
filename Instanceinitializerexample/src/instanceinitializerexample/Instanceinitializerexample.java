
package instanceinitializerexample;
class Bike
{
    int speed;
    Bike()
    {
        System.out.println(speed);
    }
    {
        speed=100;        
    }
}
public class Instanceinitializerexample {
    public static void main(String[] args) {
        Bike b1=new Bike();
        Bike b2=new Bike();
    }
    
}
