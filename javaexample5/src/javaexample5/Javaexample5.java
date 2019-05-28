/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample5;

/**
 *
 * @author home
 */
class bank
{
    float getRateOfInterest()
    {
        return 0;
    }
    
}
class SBI extends bank
{
    float getRateOfInterest()
    {
        return 6.25f;
    }
            
}
class Axis extends bank
{
    float getRateOfInterest()
    {
        return 6.75f;
    }
}
class Andhrabank extends bank
{
    float getRateOfInterest()
    {
        return 7f;
    }
}
class HDFC extends bank
{
    float getRateOfInterest()
    {
        return 7.25f;
    }
}
public class Javaexample5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        bank b;
        b=new SBI();
            System.out.println("SBI rate of insterest="+b.getRateOfInterest());
        b=new Axis();
        System.out.println("Axis rate of interest="+b.getRateOfInterest());
        b=new Andhrabank();
        System.out.println("Andhrabank rate of interest="+b.getRateOfInterest());
        b=new HDFC();
        System.out.println("HDFC rate of interest="+b.getRateOfInterest());
    }
    
}
