package main.java.org.example;

public class CWE798 {
  void hardCodedCredentials(String password) {
    if(password == "Password123"){
      System.out.println("Login Successful.");
    }else {
      System.out.println("Login unsuccessful.");
    }
  }

  void hardCodedCredentialsNonComplaint() {
    String password = System.getenv("PASSWORD"); // USE OF ENV VARIABLES TO SECURE STORAGE MECHANISM

    if(password.equals("Password123")) {
      System.out.println("Login Successful.");
    }else {
      System.out.println("Login unsuccessful.");
    }
  }
}
