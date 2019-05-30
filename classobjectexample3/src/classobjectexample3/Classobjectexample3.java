/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobjectexample3;


    class person {
    int aadarnum;
    String name;
    void insert(int a,String n)
    {
       aadarnum=a;
       name=n;
    }
    void display()
    {
        System.out.println(aadarnum+" "+name);
    }
}
public class Classobjectexample3 {

    public static void main(String args[])
    {
        person p1=new person();
        person p2=new person();
        p1.aadarnum=12;
        p1.name="ammu";
        p2.aadarnum=15;
        p2.name="Arun";
        System.out.println(p1.aadarnum+" "+p1.name);
        System.out.println(p2.aadarnum+" "+p2.name);
        
        
    }
}
   
