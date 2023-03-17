package org.example;

public class CWE125 {
   int[] arr = new int[5];

  void printArrayList() {
    for (int i = 0 ; i < 5 ; i++) {
      arr[i] = i;
    }
    for (int i = 0 ; i <= 5 ; i++) {
      System.out.println(arr[i])
    }
  }

  void nonComplaintPrintArray() {
    int[] arr = new int[5];

    void printArrayList() {
      for (int i = 0; i < 5; i++) {
        arr[i] = i;
      }
      for (int i = 0 ; i <= 5 ; i++) {
        if( i <= arr.length) {
          System.out.println(arr[i])
        }
      }
    }
  }

}
