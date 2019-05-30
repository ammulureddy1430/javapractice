/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobjectexample4;

/**
 *
 * @author home
 */
class rectangle
{
    int length,breadth;
    void insert(int l,int b)
    {
        length=l;
        breadth=b;
    }
    void calculate()
    {
        System.out.println(length*breadth);
    }
}
public class Classobjectexample4 {

   
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        rectangle r2=new rectangle();
        r1.insert(5,9);
        r2.insert(7,8);
        r1.calculate();
        r2.calculate();
        
    }
    
}
