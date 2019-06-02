
package inheritanceexample4;

class Student
{
    int rollnum;
    void getdata(int x)
    {
        rollnum=x;
    }

}
class Test extends Student
{
    int m1,m2;
    void getmarks(int a,int b)
    {
        m1=a;
        m2=b;
    }
}
class Result extends Test
{
    int total;
  
    void display()
    {
        System.out.println("rollnum="+rollnum);
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        total=m1+m2;
        System.out.println("result="+total);
    }
}
public class Inheritanceexample4 {

    
    public static void main(String[] args) {
       Result r=new Result();
       r.getdata(1789);
       r.getmarks(49,50);
       r.display();
    }
    
}
