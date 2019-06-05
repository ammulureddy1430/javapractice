
package methodoverloadingexample;
class Adder
{
    void sum_m1(int i)
    {
        System.out.println(i);
    }
    void sum_m1(int k,float l)
    {
        System.out.println((k+l));
    }
}

public class Methodoverloadingexample {
    public static void main(String[] args) {
        Adder a1=new Adder();
        a1.sum_m1(10);
        a1.sum_m1(50,40.5f);
    }
    
}
