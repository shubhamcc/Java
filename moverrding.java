import java.util.*;

 // Compiler version JDK 11.0.2

 class mover
 {
      public void show()
      {
      System.out.println("  base class");
      }
 }
 class mover1 extends mover
 {
      public void show()
      {
        super.show();
      System.out.println(" derived class");
      }
 }
 class moverrding
 {
      public static void main(String args[])
      {
          mover1 m1=new mover1();
          m1.show();
         
          
      }
 }
