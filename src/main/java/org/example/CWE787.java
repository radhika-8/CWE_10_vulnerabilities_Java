package org.example;

import java.util.ArrayList;

public class CWE787 {
  ArrayList<Integer> integerArrayList = new ArrayList<>(5);

  //int[] arr = new int[5];

  void outOfBoundWrite() {
    for (int i = 0 ; i <= 5 ; i++){
      integerArrayList.add(i);
    }
  }

  void outOfBoundWriteNonComplaint() {
    for (int i = 0 ; i <= 5 ; i++)
      if(i <= integerArrayList.size()) {
        integerArrayList.add(i);
      }
  }

}
