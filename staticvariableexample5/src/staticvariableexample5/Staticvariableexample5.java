/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariableexample5;

/**
 *
 * @author home
 */
class Employee
{
    int Eid;
    String name;
    static String companyname="Infosys";
    static void change()
    {
        companyname="Google";
    }
    Employee(int i,String n)
    {
        Eid=i;
        name=n;
}
    void display()
    {
        System.out.println(Eid+" "+name+" "+companyname);
    }
}
public class Staticvariableexample5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee.change();
    Employee e1=new Employee(9888,"AmmuluReddy");
    Employee e2=new Employee(7843,"ArunReddy");
    e1.display();
    e2.display();
    }
    
}
