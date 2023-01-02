package dev_java.basic1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExam1 {
  public static void main(String[] args) {
    // List 따로 Map따로 사용하는 경우보다는 주로 List<Map<>>꼴로 많이 사용됨
    // 오라클에서 제공하는 테이블 구조에서 튜플을 구성할때 Map을 사용가능함
    // Member테이블 기준으로 코드작성
    List<Map<String, Object>> plist = new ArrayList<>();
    Map<String, Object> pmap = new HashMap<>(); // 싱글스레드에서 안전~~

    pmap.put("mem_id", "kiwi");
    pmap.put("mem_pw", "123");
    pmap.put("mem_nick", "나초보");
    plist.add(pmap);

    pmap = new HashMap<>();// 새로운 주소번지가 할당된다
    pmap.put("mem_id", "tomato");
    pmap.put("mem_pw", "123");
    pmap.put("mem_nick", "나신입");
    plist.add(pmap);

    pmap = new HashMap<>();
    pmap.put("mem_id", "banana");
    pmap.put("mem_pw", "123");
    pmap.put("mem_nick", "나일등");
    plist.add(pmap);
    // map의 키값은 DB테이블의 컬럼명과 통일하기 - 권장
    // 키값을 출력 - mem_id,mem_pw,mem_nick
    Object[] keys = pmap.keySet().toArray();
    // for (Object s : keys) {
    // System.out.println(s.toString());
    // System.out.println(pmap.get(s).toString());
    // }
    for (int i = 0; i < plist.size(); i++) {
      Map<String, Object> rMap = plist.get(i);
      System.out.println(rMap.get("mem_id") + "," + rMap.get("mem_pw") + "," + rMap.get("mem_nick"));
    }

  }
}
