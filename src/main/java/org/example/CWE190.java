package org.example;

public class CWE190 {
  void integerWraparound() {
    int value = Integer.MAX_VALUE - 1;
    for ( int i = 0 ; i < 4 ; i++, value++)
      System.out.println(value);
  }
}
