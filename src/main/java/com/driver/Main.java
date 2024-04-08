package com.driver;

public class Main {
   public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B objectB = new B();
         // Output: Invoking method from class A
        
        // Task 5: Call the overridden method from object of class B
      System.out.println(objectB.meth());  // Output: Method is overridden in Extended class B
    }
}
