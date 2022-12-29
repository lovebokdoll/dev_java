package dev_java.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest5 {
  public static void main(String[] args) {
    List<Map<String, Object>> list = new ArrayList<>();
    Map<String, Object> rmap = new HashMap<>();
    rmap.put("mem_id", "tomato");
    list.add(rmap);
    System.out.println("1:" + rmap);
    rmap = new HashMap<>();
    rmap.put("mem_id", "apple");
    list.add(rmap);
    System.out.println("2:" + rmap);
    // tomato출력하고싶다 어쩌지
    System.out.println(list.get(0).get("mem_id"));
    System.out.println(list.get(1).get("mem_id"));
    rmap = new HashMap<>();
    System.out.println("3:" + rmap);

  }
}
