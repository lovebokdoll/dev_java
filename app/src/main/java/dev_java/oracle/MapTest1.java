package dev_java.oracle;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
  Map<String, Object> rMap = new HashMap<>();// rMap.size()=0

  public void setMap() {
    rMap.put("deptno", 10);
    rMap.put("dname", "인사부");
    rMap.put("loc", "서울");
    rMap.put("loc", "부산");
  }

  public static void main(String[] args) {
    /* map에 접근 */
    MapTest1 mt1 = new MapTest1();
    mt1.setMap();
    System.out.println(mt1.rMap.size());
    // map에서 제공하는 메소드 중에서 key값을 묶음처리하는 메소드가 있당
    Set<String> set = mt1.rMap.keySet();
    /* 값 가져오는 방법 1 */
    Object obj[] = set.toArray();// Set인터페이스가 제공하는 메소드 중에서 toArray()지원함
    for (int i = 0; i < obj.length; i++) {// obj.length는 배열의 원소 개수-3개 deptno,dname,loc
      String key = (String) obj[i];// 배열에서 꺼낸 값은 key값이다
      System.out.println("key:" + key);// 순서가 맞지 않아유
    }
    /* 값 가져오는 방법 2 */
    Iterator<String> iter = set.iterator();
    while (iter.hasNext()) {// .hasNext() 자료구조 안에 값이 있는지 체크해서 있으면 true반환하고 없으면 false
      String key = iter.next();
      // String value = (String) mt1.rMap.get(key);// V get(Object key) 주어진키의값을리턴
      Object value = mt1.rMap.get(key);// V get(Object key) 주어진키의값을리턴
      System.out.println(key + "," + value);
    }
  }
}
