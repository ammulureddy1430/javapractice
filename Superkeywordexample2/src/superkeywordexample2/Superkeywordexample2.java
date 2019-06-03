
package superkeywordexample2;
class Parent
{
    int m1=90;
   void m1()
   {
     System.out.println("m1="+m1);
   }
}
class Child extends Parent
{
    int m1=90;
    int m2=35;
    void m2()
    {
      System.out.println("m2="+m2);
    }
    void display()
    {
        super.m1();
        m2();
    }
}
public class Superkeywordexample2 {
    public static void main(String[] args) {
       Child c=new Child();
       c.display();
    }
    
}
