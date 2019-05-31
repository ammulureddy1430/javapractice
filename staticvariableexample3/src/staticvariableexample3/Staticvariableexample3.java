/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariableexample3;

/**
 *
 * @author home
 */
class counter
{
     int count=0;
    counter()
    {
        count++;
        System.out.println(count);
    }
}
public class Staticvariableexample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    counter c1=new counter();
    counter c2=new counter();
    counter c3=new counter();
    }
    
}
