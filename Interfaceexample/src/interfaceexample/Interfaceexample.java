
package interfaceexample;
interface Fridge
{
void cool();
}
interface Watch
{
  void show();
}
class Interfaceexample implements Fridge,Watch
{
public void cool()
{
    System.out.println("makes water cool and keeps vegetables fresh");
}
public void show()
{
    System.out.println("it shows time");
}
    public static void main(String[] args) {
  Interfaceexample i=new Interfaceexample();
  i.cool();
  i.show();
}
}
