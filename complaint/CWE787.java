package org.example;

import java.util.ArrayList;

public class CWE787 {
  ArrayList<Integer> integerArrayList = new ArrayList<>(5);

  int[] arr = new int[5];

  void initializeArrayList() {
    for (int i = 0 ; i <= 5 ; i++){
      integerArrayList.add(i);
    }
    arr[6] = 22;
  }

}
