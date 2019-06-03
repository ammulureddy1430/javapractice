
package thisexample1;
class Employee
{
    int id;
    String name;
    String cname;
    Employee(int id,String name,String cname)
    {
        this.id=id;      //This keyword is used to refer current class instance variable
        this.name=name;
        this.cname=cname;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+cname);
    }
}
public class Thisexample1 {
    public static void main(String[] args) {
        Employee e=new Employee(123,"Ammulu","Google");
        e.display();
    }
    
}
