
package interfaceexample;
interface Laptop
{
    void msg();
}
class Dell implements Laptop
{
    public void msg()
    {
        System.out.println("dell is the best laptop ");
    }
}
 class Interfaceexample1 {
   public static void main(String args[])
   {
          
        Laptop l=new Dell();
        l.msg();
   }
}
