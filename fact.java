import java.util.*;

 // Compiler version JDK 11.0.2

 class fact
 {
 public static void main(String[]args)
 {
      int n,factorial=1;
      Scanner r=new Scanner(System.in);
      System.out.println("Enter any no");
      n=r.nextInt();
      
      for(int i=1;i<=n;i++)
      {
           factorial=factorial*i;
      }
      System.out.println("factorial"+factorial);
 }
 }
