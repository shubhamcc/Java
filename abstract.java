import java.util.*;

 // Compiler version JDK 11.0.2

 abstract class animal
 {
      public abstract void sound();
 }
 class Dog extends animal
 {
      public void sound()
      {
           System.out.println(" Dog is barking");
      }
 }
 class Lion extends animal
 {
       public void sound()
       {
             System.out.println("Lion is Roar");
       }
 }
 class test
 {
      public static void main(String[]args)
      {
          Dog d=new Dog();
          Lion l=new Lion();
          d.sound();
          l.sound();
      }
 }