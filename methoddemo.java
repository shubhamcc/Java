import java.util.*;

 // Compiler version JDK 11.0.2

 class methodovid
 {
     int a,b,c;
     void read(int x,int y)
     {
         a=x;
         b=y;
     }
     void read(int z)
     {
         c=z;
     }
     void display()
     {
         System.out.print(a+b+c);
     }
 }
 class methoddemo
 {
      public static void main(String[] args)
      {
          methodovid m=new methodovid();
          m.read(40000,50760);
          m.read(6000479);
          m.display();
      }
 }
