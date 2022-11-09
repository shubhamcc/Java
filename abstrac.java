abstract class demo
{
  int a;
  void read()
  {
    a=10;
  }
  public abstract void display();
}

class demo1 extends demo
{
  public void display()
  {
    System.out.println(a);
  }
}

class abstract1
{
  public static void main(String args[])
  {
  demo1 r1=new demo1();
  r1.read();
  r1.display();
  }
}