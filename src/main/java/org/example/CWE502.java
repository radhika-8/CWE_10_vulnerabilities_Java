package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CWE502 {
  void deserializationOfData() throws FileNotFoundException {
    try {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("serialised_object.daat"));

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
