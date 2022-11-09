import java.util.*;

 // Compiler version JDK 11.0.2

 interface client
 {
     void  input();
     void  output();
 }
 class Raju implements client
 {
     String name;
     Double sal;
     public void input()
     {
           Scanner r=new Scanner(System.in);
           System.out.print("Print username");
           name=r.nextLine();
           
           System.out.print("user salary");
           sal=r.nextDouble();
           
     }
     public void output()
     {
           System.out.print(name+sal);
     }
     public static void main(String[] args)
     {
           client c=new Raju();
           c.input();
           c.output();
     }
     
 }