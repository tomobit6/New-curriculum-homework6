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
    Map<Integer, String> characterMap = new HashMap<>();

    characterMap.put(1, characterNames[0]);
    characterMap.put(2, characterNames[1]);
    characterMap.put(3, characterNames[2]);
    characterMap.put(4, characterNames[3]);
    characterMap.put(5, characterNames[4]);
    characterMap.put(6, characterNames[5]);
    characterMap.put(7, characterNames[6]);
    characterMap.put(8, characterNames[7]);
    characterMap.put(9, characterNames[8]);
    characterMap.put(10, characterNames[9]);

    for (Map.Entry<Integer, String> name2 : characterMap.entrySet()) {
      if (name2.getKey() % 2 == 0) {
        String removed = characterMap.remove(name2);
      } else {
        System.out.println(name2.getKey() + ":" + name2.getValue());
      }
    }
  }
}
