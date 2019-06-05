
package instanceinitializerexample;
class Aeroplane
{
    int noofseats;
    Aeroplane()
    {
        System.out.println("no of seats="+noofseats);
    }
    {
        noofseats=500;
    }
}
class Emirates extends Aeroplane
{
    Emirates()
    {
        super();
        System.out.println("Hyd To UK");      
    }
}
public class Instanceinitializerexample1 {
    public static void main(String args[])
    {
    Emirates e=new Emirates();
}
}