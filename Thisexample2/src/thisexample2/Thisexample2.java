
package thisexample2;
class Student 
{
    int rollnum;
    String name;
    String course;
    float fee;
    Student(int rollnum,String name,String course)
    {
        this.rollnum=rollnum;
        this.name=name;
        this.course=course;
    }
    Student(int rollnum,String name,String course,float fee)
    {
        this(rollnum,name,course);           //this() is reusing constructor
        this.fee=fee;
    }
    void display()
    {
   System.out.println(rollnum+" "+name+" "+course+" "+fee);
    }
}

public class Thisexample2 {

    public static void main(String[] args) {
       Student s1=new Student(29,"Arun","CSE");
       Student s2=new Student(32,"Ammulu","CSE",78000f);   //f consists float values
       s1.display();
       s2.display();  
    }
    
}
