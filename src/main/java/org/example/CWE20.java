package main.java.org.example;

import java.io.File;
import java.util.Scanner;

public class CWE20 {
  void improperInputValidation() {
    final double price = 20.00;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the quantity: ");
    int quantity = sc.nextInt();
    double total = price * quantity; //Quantity can be negative and it is not checked.
    System.out.println("Total: "+total);
  }

  void properInputValidation() {
    final double price = 20.00;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the quantity: ");
    int quantity = sc.nextInt();
    if (quantity >= 0) { // Validating whether the quantity is positive or not
      double total = price * quantity;
      System.out.println("Total: "+total);
    } else {
      System.out.println("Please enter a valid input.");
    }
  }
}
