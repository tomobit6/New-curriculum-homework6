package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    System.out.println("第1課題");
    String[] characterNames = new String[]{"悟空", "ベジータ", "ピッコロ", "悟飯", "チチ", "ブルマ",
        "セル", "フリーザ", "17号", "ブウ"};
    List<String> characterNamesList = Arrays.asList(characterNames);
    for (String name : characterNamesList) {
      if (name.length() >= 3) {
        System.out.println(name);
      }
    }
    System.out.println("第2課題");
    Map<Integer, String> charactermap = new HashMap<>();

    charactermap.put(1, characterNames[0]);
    charactermap.put(2, characterNames[1]);
    charactermap.put(3, characterNames[2]);
    charactermap.put(4, characterNames[3]);
    charactermap.put(5, characterNames[4]);
    charactermap.put(6, characterNames[5]);
    charactermap.put(7, characterNames[6]);
    charactermap.put(8, characterNames[7]);
    charactermap.put(9, characterNames[8]);
    charactermap.put(10, characterNames[9]);

    for (Map.Entry<Integer, String> name2 : charactermap.entrySet()) {
      if (name2.getKey() % 2 == 0) {
        String removed = charactermap.remove(name2);
      } else {
        System.out.println(name2.getKey() + ":" + name2.getValue());
      }
    }
  }
}
