import java.util.*;

 // Compiler version JDK 11.0.2

 class one
 {
      int a,b;
      void get()
      {
           a=10;
           b=10;
      }
 }
 class second extends one
 {
       void show()
       {
            System.out.print(a+b);
       }
       public static void main(String args[])
       {
             second r=new second();
             r.get();
             r.show();
       }
 }