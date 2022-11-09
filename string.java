//Write Java Program That Demonstrate All String Operations.

import java.util.Scanner;

class string
{
  public static void main(String[] args)
  {

    // create a string
    String first = "Hello";
    String second = "World";
    String third = "World";
    System.out.println("First :- " + first);
    System.out.println("Second :- " + second);     
    
    //charAt Function
    char ch=first.charAt(0);
    System.out.println("Character at :- "+ch);
    
    //Upper Strings
    String upperStr=first.toUpperCase();
    System.out.println("Upper case is :- "+upperStr);
    
    //Lower String
    String lowerStr=second.toLowerCase();
    System.out.println("Lower case is :- "+lowerStr);

     // join two strings
    String join = first.concat(second);
    System.out.println("Join String :- " + join);

    // get the length of greet
    int length = join.length();
    System.out.println("Length :- " + length);

    // compare first and second strings
    boolean result1 = first.equals(second);
    System.out.println("Strings first and second are equal :- " + result1);
    
    // compare second and third strings
    boolean result2 = second.equals(third);
    System.out.println("Strings second and third are equal :- " + result2);

  }
}

