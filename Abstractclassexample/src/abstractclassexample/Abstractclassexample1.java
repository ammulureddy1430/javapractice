package abstractclassexample;
abstract class Cooler
{
    abstract void work();
    
        void fan()
        {
            System.out.println("fan is turned on");
        }
    
}
class Samsung extends Cooler
{
    void work()
    {
      System.out.println("cooler is working");
    }
}
public class Abstractclassexample1 {
    public static void main(String args[])
    {
    Cooler s=new Samsung();
    s.fan();
    s.work();
    }
}
