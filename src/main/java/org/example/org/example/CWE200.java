package org.example;

import java.io.File;
import java.util.Scanner;

public class CWE200 {

  private String password = "Password123";
  void sensitiveDataExposure() {
    String password = "password123";
    System.out.println("Your password is: "+ password);
  }

//  void sensitiveDataExposureNonComplaint() {
//    System.out.println("Your password is: "+ password);
//
//  }

}
