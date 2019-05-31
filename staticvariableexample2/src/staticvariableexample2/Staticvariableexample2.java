/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariableexample2;

/**
 *
 * @author home
 */
class Doctor
{
  int id;
  String name;
  static String hospitalname="Apollohospital";
  Doctor(int i,String n)
  {
      id=i;
      name=n;
  }
  void display()
  {
      System.out.println(id+" "+name+" "+hospitalname);
  }
  
}
public class Staticvariableexample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Doctor d1=new Doctor(7590,"AmmuluReddy");
   Doctor d2=new Doctor(4086,"ArunKumarReddy");
   d1.display();
   d2.display();
    }
    
}
