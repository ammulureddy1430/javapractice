/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobjectexample2;

/**
 *
 * @author home
 */
class House
{
    int nooffloors;
    String ownername;
    String address;
    void insert(int f,String n,String a)
    {
        nooffloors=f;
        ownername=n;
        address=a;
    }

void display()
{
System.out.println(nooffloors+" "+ownername+" "+address);
    
}
}
public class Classobjectexample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
House h1=new House();
House h2=new House();
h1.insert(2,"AshokReddy","Chilkanagr");
h2.insert(1,"Manga","Ramanthapur");
h1.display();
h2.display();
    }
    
}
