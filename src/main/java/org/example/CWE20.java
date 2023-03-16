package org.example;

import java.io.File;
import java.util.Scanner;

public class CWE20 {
  void improperInputValidation() {
    public static final double price = 20.00;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the quantity: ");
    int quantity = sc.nextInt();
    double total = price * quantity; //Quantity can be negative and it is not checked.
    System.out.println("Total: "+total);
  }

  void properInputValidation() {
    public static final double price = 20.00;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the quantity: ");
    int quantity = sc.nextInt();
    if (quantity >= 0) {
      System.out.println("Total: "+total);
    } else {
      System.out.println("Please enter a valid input.");
    }
  }
}
