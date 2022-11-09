import java.util.*;

 // Compiler version JDK 11.0
 interface A
 {
      void show();
 }
 interface B
 {
      void disp();
 }
 class multiple implements A,B
 {
       public void show()
       {
            System.out.println("Inteface A");
       }
       public void disp()
       {
            System.out.println("Interface B");
       }
       public static void main(String args[])
       {
            multiple r=new multiple();
            r.show();
            r.disp();
       }
     
 }
 