package dev_java.oracle;

import java.util.HashMap;
import java.util.Map;

public class MapTest4 {
  public static void main(String[] args) {
    Map<String, Object> rmap = new HashMap<>();
    rmap.put("mem_id", "tomato");
    System.out.println("1:" + rmap);
    rmap = new HashMap<>();
    rmap.put("mem_id", "kiwi");
    System.out.println("2:" + rmap);
    rmap = new HashMap<>();
    rmap.put("mem_id", "apple");
    System.out.println("3:" + rmap);
    rmap = new HashMap<>();
  }
}
