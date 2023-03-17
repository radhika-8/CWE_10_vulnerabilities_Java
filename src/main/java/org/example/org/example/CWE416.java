package org.example;

import java.util.ArrayList;
import java.util.List;

public class CWE416 {
  //Use after free
  void showArrayListNull() {
    List<String> stringList = new ArrayList<>();
    stringList.add("String 1");
    stringList.add("String 2");
    stringList.add("String 3");

    //String str = stringList.get(0);
    stringList.clear();
    System.out.println(stringList.size());
  }
}
