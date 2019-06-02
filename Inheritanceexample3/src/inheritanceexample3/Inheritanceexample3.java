
package inheritanceexample3;

class Animal         //super class
{
   void eat()      //method
   {
       System.out.println("eating.....");
   }
}
class Dog extends Animal     //subclass extends super class(Animal)
{
    void bark()         //method
    {
        System.out.println("barking at humans");
    }
}
class Babydog extends Dog            //sub class extends super-sub class(Dog)
{
    void weep()        //method
    {
        System.out.println("weeping..");
    }
}
public class Inheritanceexample3 {

    
    public static void main(String[] args) {
       Babydog b=new Babydog();
       b.weep();
       b.bark();
       b.eat();
    }
    
}
