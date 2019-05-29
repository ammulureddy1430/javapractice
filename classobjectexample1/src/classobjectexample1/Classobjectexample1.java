/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobjectexample1;

/**
 *
 * @author home
 */
public class Classobjectexample1 {

    /**
     * @param args the command line arguments
     */
    int rollnumber;
    String name;
}
class test
{
    public static void main(String[] args) {
        // TODO code application logic here
    Classobjectexample1 c=new Classobjectexample1();
    Classobjectexample1 c1=new Classobjectexample1();
    c.rollnumber=25;
    c.name="Ammulu";
    c1.rollnumber=30;
    c1.name="Chaitanya";
    System.out.println(c.rollnumber+" "+c.name);
    System.out.println(c1.rollnumber+" "+c1.name);
    
    }
    
}
