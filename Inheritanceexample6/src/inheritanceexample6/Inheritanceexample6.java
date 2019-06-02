
package inheritanceexample6;

class One
{
    int a=30;
    void display()
    {
        System.out.println("parent class");
    }
    
}
class Two extends One
{
    int b=60;
    void disp()
    {
        System.out.println("intermediate subclass");
    }
}
class Three extends One
{
    int c=25;
    void show()
    {
        System.out.println("subclass");
    }
}
public class Inheritanceexample6 {

   
    public static void main(String[] args) {
Three t=new Three();
System.out.println(t.c);
t.show();
    }
}