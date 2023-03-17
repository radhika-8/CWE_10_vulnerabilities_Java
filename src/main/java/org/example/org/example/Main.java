package org.example;

public class Main {
  public static void main(String[] args) {
//
//    //Out-of-bounds Write
//    org.example.CWE787 cwe787;
//    cwe787 = new org.example.CWE787();
//    cwe787.outOfBoundWrite();
//    cwe787.outOfBoundWriteNonComplaint();
//
//    //Out-of-bounds Read
//    org.example.CWE125 cwe125 = new org.example.CWE125();
//    cwe125.printArrayList();
//    cwe125.nonComplaintPrintArray();
//
//    //Use After Free
//    //There is no way to deallocate the memory in Java
//    org.example.CWE416 cwe416 = new org.example.CWE416();
//    cwe416.showArrayListNull();
//
//    //Null Pointer Dereference
//    org.example.CWE476 cwe476 = new org.example.CWE476();
//    cwe476.nullPointerDereference();
//    cwe476.nullPointerDereferenceNonComplaint();
//
//    //Use of Hard Coded Credentials
//    org.example.CWE798 cwe798 = new org.example.CWE798();
//    cwe798.hardCodedCredentials("");
//    cwe798.hardCodedCredentialsNonComplaint();
//
//    //Integer WrapAround
//    org.example.CWE190 cwe190 = new org.example.CWE190();
//    cwe190.integerWraparound();
//
//    //Improper Input Validation
//    org.example.CWE20 cwe20 = new org.example.CWE20();
//    cwe20.improperInputValidation();
//    cwe20.properInputValidation();
//
//    //Restricted Directory Path
//    org.example.CWE22 cwe22 = new org.example.CWE22();
//    cwe22.restrictedDirectoryPathComplaint();
//    cwe22.restrictedDirectoryPathNonComplaint();

    //Exposure to sensitive data to unauthorized Actor
    org.example.CWE200 cwe200 = new org.example.CWE200();
    cwe200.sensitiveDataExposure();
//    cwe200.sensitiveDataExposureNonComplaint();
  }
}