
package constructorexample2;

class college
{
    int cid;
    String cname;
    String location;
    college(int i,String n)
    {
        cid=i;
        cname=n;
    }
    college(int i,String n,String l)
    {
        cid=i;
        cname=n;
        location=l;
    }
    void display()
    {
        System.out.println(cid+" "+cname+" "+location);
    }
}
  
public class Constructorexample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
  college c1=new college(5678,"gnit","ibrahimpatnam");
  college c2=new college(3724,"kmit","narayanaguda");
  c1.display();
  c2.display();
    }
    
}
  