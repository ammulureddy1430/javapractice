
package superkeywordexample5;
class P        //parentclass
{
    P()        //parentclass constructor
    {
    int a=100;
    int b=60;
    int c=a+b;
    {
      System.out.println("sum="+c);
    }
    }
}
class V extends P      //childclass
{
    V()       //childclass constructor
    {
    super();   //super() is used to call parent class constructor
    int d=90;
    System.out.println("d="+d);
}
}
public class Superkeywordexample5 {
    public static void main(String[] args) {
       V s=new V();
    }
    
}
