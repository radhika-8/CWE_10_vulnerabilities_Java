package org.example;

import java.io.File;

public class CWE22 {
  void restrictedDirectoryPathComplaint() {
    String restrictedDirectory = "";
    String fileName = "";
    File file = new File(restrictedDirectory + fileName);
    if(file.exists()) {
      // Do some stuff with this file
    }else {
      System.out.println("File not found");
    }
  }

  void restrictedDirectoryPathNonComplaint() {
    String restrictedDirectory = "";
    String fileName = "";
    File file = new File(restrictedDirectory + fileName);
    if(!file.startsWith(restrictedDir)) {
      throw new SecurityException("Access to file is not allowed.")
    }

    if(fil.exists()) {
      //
    } else {
      System.out.println("File not found.");
    }
  }
}
