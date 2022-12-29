package dev_java.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//회원정보 담기 3*4로 만들어볼게여 사람이 3명 사람에대한 정보4가지
// 회원 id | 이름 | pw | 성별
// mem_id | mem_name | mem_pw | mem_gender
// tomato | 토마토 | 123 | 남자
// banana | 바나나 | 123 | 여자
// kiwi | 키위 | 123 | 남자
public class MapTest3 {
  List<Map<String, Object>> list = new ArrayList<>();
  Map<String, Object> mMap = new HashMap<>();// 여기서 생성했으니까 아래에서는 생성하지 않음

  // 키값 넣을때 put ~~
  public void setMap() {
    mMap.put("mem_id", "tomato");
    mMap.put("mem_name", "토마토");
    mMap.put("mem_pw", "123");
    mMap.put("mem_gender", "남자");
    list.add(mMap);
    mMap = new HashMap<>();// 덮어쓰기 되기때문에 그걸 방지하기위해 복사본 생성, 중복되지 않는 상태
    mMap.put("mem_id", "banana");
    mMap.put("mem_name", "바나나");
    mMap.put("mem_pw", "123");
    mMap.put("mem_gender", "여자");
    list.add(mMap);// 날라가기전에 추가
    mMap = new HashMap<>();// 복사본이 만들어짐
    mMap.put("mem_id", "kiwi");
    mMap.put("mem_name", "키위");
    mMap.put("mem_pw", "123");
    mMap.put("mem_gender", "남자");
    list.add(mMap);
  }

  public static void main(String[] args) {
    MapTest3 mt3 = new MapTest3();
    mt3.setMap();
    // System.out.println(mt3.mMap);
    System.out.println(mt3.list.get(0)); // map출력
    System.out.println(mt3.list.get(0).get("mem_id"));
    System.out.println(mt3.list.size());

    // String tomatoname = mt3.list.get(0).get("mem_id").toString();
    // System.out.println(tomatoname);

  }
}
