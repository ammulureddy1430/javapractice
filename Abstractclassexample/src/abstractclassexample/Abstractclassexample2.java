
package abstractclassexample;
abstract class Aeroplane
{
    Aeroplane()
    {
        System.out.println("flying against air");
    }
    abstract void work();
    void engine()
    {
        System.out.println("engine works as like air goes back and plane move forword");
    
}
}
      class Emirates extends Aeroplane
    {
       
        void work()
        {
            System.out.println("Landing gear used to land flight ");
        }

    }
public class Abstractclassexample2 {
  public static void main(String args[])
  {
      Aeroplane a=new Emirates();
      a.work();
      a.engine();
  }
}
