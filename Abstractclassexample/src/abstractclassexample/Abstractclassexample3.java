
package abstractclassexample;
abstract class Phone
{
    abstract void color();
    void display()
    {
        System.out.println("smartphones display have 16:9 ratio");
    }
  
}
class Nokia extends Phone
{
    void color()
    {
        System.out.println("Black");
    }
}
public class Abstractclassexample3 {
    public static void main(String args[])
    {
        Phone p=new Nokia();
        p.display();
        p.color();
    }
}
