package org.example;

public class Main {
  public static void main(String[] args) {

    //Out-of-bounds Write
    CWE787 cwe787 = new CWE787();
    cwe787.initializeArrayList();
    cwe787.outOfBoundWriteNonComplaint();

    //Out-of-bounds Read
    CWE125 cwe125 = new CWE125();
    cwe125.printArrayList();
    cwe125.nonComplaintPrintArray();

    //Use After Free
    //There is no way to deallocate the memory in Java
    CWE416 cwe416 = new CWE416();
    cwe416.showArrayListNull();

    //Null Pointer Dereference
    CWE476 cwe476 = new CWE476();
    cwe476.nullPointerDereference();
    cwe476.nullPointerDereferenceNonComplaint();

    //Use of Hard Coded Credentials
    CWE798 cwe798 = new CWE798();
    cwe798.hardCodedCredentials("");
    cwe798.hardCodedCredentialsNonComplaint();

    //Integer WrapAround
    CWE190 cwe190 = new CWE190();
    cwe190.integerWraparound();

    //Improper Input Validation
    CWE20 cwe20 = new CWE20();
    cwe20.improperInputValidation();
    cwe20.properInputValidation();

    //Restricted Directory Path
    CWE22 cwe22 = new CWE22();
    cwe22.restrictedDirectoryPathComplaint();
    cwe22.restrictedDirectoryPathNonComplaint();


  }
}