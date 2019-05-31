/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariableexample4;

/**
 *
 * @author home
 */
class counter
{
    static int count=2;
    counter()
    {
        count++;
        System.out.println(count);
    }
            
     
}
public class Staticvariableexample4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        counter c5=new counter();
        counter c7=new counter();
        counter c9=new counter();
    }
    
}
