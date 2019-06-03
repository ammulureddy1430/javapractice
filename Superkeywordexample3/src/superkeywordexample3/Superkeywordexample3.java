
package superkeywordexample3;
class Animal       //parent class
{
    void eat()      //method in parent class acts as a super class
    {
        System.out.println("eating...");
    }
}
class Lion extends Animal    //child class
{
    void eat()      //method in childclass
    {
        System.out.println("eating zebra..");
    }
    void roar()   //method in child class
    {
        System.out.println("roaring...");
        
    }
    void display()
    {
        super.eat();      //super is used to call method in parent class
        roar();
    }
   
}
public class Superkeywordexample3 {

    public static void main(String[] args) {
      Lion l=new Lion();
      l.display();
    }
    
}
