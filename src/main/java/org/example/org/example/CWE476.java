package org.example;

public class CWE476 {
   String str = null;

   void nullPointerDereference() {
     System.out.println(str);
     // Printing String even though it is null which will throw null pointer exception
   }

   void nullPointerDereferenceNonComplaint() {
     if (str != null) // First checking whether the string is null or not.
       System.out.println(str);
     else
       System.out.println("The string is null.");
   }
}
