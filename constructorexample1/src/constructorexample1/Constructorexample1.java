/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorexample1;

/**
 *
 * @author home
 */
class Student
{
    int rollnum;
    String name;
    Student(int r,String n)
    {
        rollnum=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollnum+" "+name);
    }
}
public class Constructorexample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Student s1=new Student(1,"Ammu");
 Student s2=new Student(2,"Arun");
 s1.display();
 s2.display();
 
    }
    
}
