
package inheritanceexample5;
class Animal        //super class
{
    void eat()
    {
        System.out.println("eating.....");
    }
}
 class Cat extends Animal         //intermediate sub class
 {
     void meow()
     {
         System.out.println("meowing..");
     }
 }

class Dog extends Animal         //sub class
{
    void bark()
    {
        System.out.println("barking ..");
    }
}
public class Inheritanceexample5 {

    
    public static void main(String[] args) {
     Dog d=new Dog();
     d.bark();
     d.eat();
     
    }
    
}
