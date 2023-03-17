package org.example;

public class CWE476 {
   String str = null;

   void nullPointerDereference() {
     System.out.println(str);
   }

   void nullPointerDereferenceNonComplaint() {
     if (str != null)
       System.out.println(str);
     else
       System.out.printl("The string is null.");
   }
}
