/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample3;

/**
 *
 * @author home
 */
public class Javaexample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int year=2020;
       if(((year%4==0)&&(year%100!=0))||(year%400==0))
       {
           System.out.println("leap year");
       }
       else
       {
           System.out.println("normal year");
       }
            }
    
}
