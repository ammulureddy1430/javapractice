
package superkeywordexample4;
class Parent
{
    Parent()
    {
        System.out.println("Having Qualities:");
        System.out.println("Snoring");
        System.out.println("Talkative");
    }
}
class Child extends Parent
{
    Child()
    {
        super();        //super() is used to invoke parent class constructor
        System.out.println("sleeping late");
    }
}
public class Superkeywordexample4 {
    public static void main(String[] args) {
        Child c=new Child();
       
        
    }
    
}
