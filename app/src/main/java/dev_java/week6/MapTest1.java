package dev_java.week6;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

class S1 {
  int age = 28;
}

class S2 {
  String animal = "dog";
  int leg = 4;
}

class S3 {
  // 3개짜리 클래스 설계해보세옹
}

public class MapTest1 {
  List<Map<String, Object>> list = null;

  public static void main(String[] args) {
    S1 s1 = new S1();

    Map<String, Object> map1 = new HashMap<>();
    map1.put("s1", s1);
    S1 s2 = (S1) map1.get("s1");// get의 리턴타입은 Object이다.
    System.out.println(s2.age);
    //Map<String, String> map11 = new HashMap<>();
   // map1.put("s1", s1);
    Map<String, Object> map2 = new Hashtable<>();
    S2 s3 = new S2();
    map2.put("S2", s3);
    S2 s4 = (S2)map2.get("s2");
    if(s4.animal instanceof String){
      System.out.println("문자열입니다.");
      System.out.println(s4.animal);
    }
    if(new Integer(s4.leg)instanceof Integer){
      System.out.println("정수형입니다.");
      System.out.println(s4.leg);
    }
   

  }
}
