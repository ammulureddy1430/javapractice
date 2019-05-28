/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample4;

/**
 *
 * @author home
 */
public class Javaexample4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int marks=70;
        if(marks<50)
        {
            System.out.println("fail");
        }
        else if(marks>55 && marks<65)
        {
            System.out.println("B grade");
        }
        else if(marks>=65 && marks<80)
        {
            System.out.println("A grade");
        }
        else if(marks>=80 && marks<100)
        {
            System.out.println("A+ grade");
    }
        else
        {
            System.out.println("Invalid!");
        }
    }
    
}
