package org.example;

public class CWE476 {

   void nullPointerDereference() {
     String str = null;
     int length = str.length();
     System.out.println(length);
   }
}
