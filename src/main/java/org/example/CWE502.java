package main.java.org.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CWE502 {
  void deserializationOfData() {
    try {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("serialised_object.ser"));
      Object obj = in.readObject();
      // Process of deserialize the object.
      in.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  void deserializationOfDataNonComplaint() {
    try {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("serialised_object.ser"));
      Object obj = in.readObject();
      if (obj instanceof CWE125) {
        CWE125 cwe125 = (CWE125) obj;
      } else {
        throw new ClassNotFoundException("Unauthorized deserialization Attempt.");
      }
      in.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
