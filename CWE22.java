package org.example;

import java.io.File;

public class CWE22 {
  void restrictedDirectoryPath() {
    String restrictedDirectory = "";
    String fileName = "";
    File file = new File(restrictedDirectory+fileName);
    if(file.exists()) {
      // Do some stuff with this file
    }else {
      System.out.println("File not found");
    }
  }
}
