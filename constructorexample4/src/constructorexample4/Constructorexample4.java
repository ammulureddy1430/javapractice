/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorexample4;

/**
 *
 * @author home
 */
class fruit
{
    String type;
    int nooffruits;
    fruit(String t,int f)
    {
        type=t;
        nooffruits=f;
    }
    fruit()
    {
}
    void display()
    {
        System.out.println(type+" "+nooffruits);
    }
}
public class Constructorexample4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    fruit f1=new fruit("Mango",4);
    fruit f2=new fruit();
    f2.type=f1.type;
    f2.nooffruits=f1.nooffruits;
    f1.display();
    f2.display();
    
    }
    
}
