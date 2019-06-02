/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample2;

/**
 *
 * @author home
 */
class Father    //super class
{
    int a,b;
    void getdata(int x,int y)     //method with parameters x and y
    {
        a=x;
        b=y;
    }
}
class Son extends Father    //subclass
{
    int subt()            //method
    {
        int sub=a-b;
        return sub;
    }
    void display()
    {
        System.out.println("A="+a);
        System.out.println("B="+b);
        System.out.println("sub="+subt());
    }
}
public class Inheritanceexample2 {
    public static void main(String[] args) {
        Son s=new Son();
        s.getdata(27, 21);
        s.subt();
        s.display();
    }
    
}
