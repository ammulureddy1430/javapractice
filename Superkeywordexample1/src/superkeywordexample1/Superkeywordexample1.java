
package superkeywordexample1;

class Animal
{
    String color="Black";
}
class Dog extends Animal
{
    String color="white";
    void printcolor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class Superkeywordexample1 {

    public static void main(String[] args) {
       Dog d=new Dog();
       d.printcolor();
    }
    
}
