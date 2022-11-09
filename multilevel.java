import java.util.*;

 // Compiler version JDK 11.0.2

 class A
 {
     int a,b,c;
     void add()
     {
         a=10; b=20;
         c=a+b;
         System.out.println("sum of two no"+c);
     }
     void sub()
     {
         a=46; b=12;
         c=a-b;
         System.out.println("sub of two no"+c);
     }
 }
 class B extends A
 {
     void multi()
     {
         a=10; b=5;
         c=a*b;
         System.out.println("Multile of two no"+c);
     }
     void div()
     {
         a=10; b=5;
         c=a/b;
         System.out.println("divsion of two no"+c);
     }
     
 }
 class C extends B
 {
     void rem()
     {
         a=10; b=3;
         c=a%b;
         System.out.println("reminder of two no"+c);
     }
 }
 class test
 {
     public static void main(String args[])
     {
         C r=new C();
         r.add();
         r.sub();
         r.multi();
         r.div();
         r.rem();
     }
 }
