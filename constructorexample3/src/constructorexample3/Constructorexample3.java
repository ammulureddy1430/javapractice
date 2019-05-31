/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorexample3;

/**
 *
 * @author home
 */
class employee
{
    int eid;
    String ename;
    employee(int i,String n)
    {
        eid=i;
        ename=n;
    }
   employee(employee s)
   {
       eid=s.eid;
       ename=s.ename;
   }
   void display()
   {
       System.out.println(eid+" "+ename);
   }
}
public class Constructorexample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee e1=new employee(12,"Ammu");
        employee e2=new employee(e1);
        e1.display();
        e2.display();
    }
    
}
