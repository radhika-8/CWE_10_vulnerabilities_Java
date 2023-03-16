package org.example;

public class CWE798 {
  void hardCodedCredentials(String password) {
    if(password == "Password123"){
      System.out.println("Login Successful.");
    }else {
      System.out.println("Login unsuccessful.");
    }
  }
}
