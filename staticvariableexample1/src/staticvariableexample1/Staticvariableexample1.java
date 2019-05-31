/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariableexample1;

/**
 *
 * @author home
 */
class Student
{
   int id;
   String name;
   static String cname="gnit";
   Student(int i,String n)
   {
       id=i;
       name=n;
   }
   void display()
   {
       System.out.println(id+" "+name+" "+cname);
   }
}
public class Staticvariableexample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Student s1=new Student(5,"Ammu");
    Student s2=new Student(7,"Alekhya");
    s1.display();
    s2.display();
    }
    
}
