
package finalkeywordexample;
class Shape
{
    static final void draw()
    {
        System.out.println("Draw circle");
    }
}
class Circle extends Shape
{ 
    public static void main(String[] args) {
    Circle c=new Circle();
    c.draw();
    }
}

