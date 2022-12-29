package dev_java.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.transform.Source;

public class MapTest2 {
  List<Map<String, Object>> list = new ArrayList<>();// 확장시킴 => 맵에서 여러개의 로우 관리하고 싶엉요
  Map<String, Object> rMap = new HashMap<>();// rMap.size()=0

  public void setMap() {
    rMap.put("deptno", 10);
    rMap.put("dname", "인사부");
    rMap.put("loc", "서울");
    list.add(rMap);// list.get(0) - 첫번째 방에 들어감
    rMap = new HashMap<>();
    rMap.put("deptno", 20);
    rMap.put("dname", "개발부");
    rMap.put("loc", "부산");
    list.add(rMap);// list.get(1) - 두번째 방에 들어감
    rMap = new HashMap<>();
    rMap.put("deptno", 30);
    rMap.put("dname", "총무부");
    rMap.put("loc", "제주");
    list.add(rMap);// list.get(2) - 세번째 방에 들어감

  }

  public void mapPrint() {
    // 각 row안에 key가 3개 있다(column-deptno,dname,loc)
    for (int i = 0; i < list.size(); i++) {// 반복해서 처리할것은 row값이다 .get(0)/get(1)/get(2)
      Map<String, Object> m1 = list.get(i);
      // 컬럼의 수 반복해서 꺼내야함
      Object[] keys = m1.keySet().toArray();
      for (int j = 0; j < keys.length; j++) {
        String key = (String) keys[j];
        System.out.print(m1.get(key) + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    /* map에 접근 */
    MapTest2 mt1 = new MapTest2();
    mt1.setMap();
    // Map의 size는 세로방향이다!!!
    System.out.println(mt1.rMap.size());
    Set<String> set = mt1.rMap.keySet();
    Iterator<String> iter = set.iterator();
    while (iter.hasNext()) {// .hasNext() 자료구조 안에 값이 있는지 체크해서 있으면 true반환하고 없으면 false
      String key = iter.next();
      // String value = (String) mt1.rMap.get(key);// V get(Object key) 주어진키의값을리턴
      Object value = mt1.rMap.get(key);// V get(Object key) 주어진키의값을리턴
      System.out.println(key + "," + value);
    }
    mt1.mapPrint();
  }
}
