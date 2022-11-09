import java.util.*;

 // Exception handling

 class test
 {
      public static void main(String[] args)
      {
      System.out.println("main method is stared");
      int a=10,b=0,c;
      try{
            c=a/b;
            System.out.print(c);
          }
      catch(Exception e)
          {
        System.out.print(e);
          }
      System.out.println("main method ended");
      }
 }
 