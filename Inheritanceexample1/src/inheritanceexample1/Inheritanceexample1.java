/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample1;

/**
 *
 * @author home
 */
class Animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}
class Cat extends Animal

{
    void meow()
    {
        System.out.println("meowing....");
    }
}
public class Inheritanceexample1 {

    
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.eat();
    }
    
}
