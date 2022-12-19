
package dev_java.week4;

import java.util.Vector;

public class Vector21 {

 public static void main(String[] args) {
  // 2중[outter:=Vector->size(),inner:=String[]->length] for문 돌림
  // 끼워넣기 가능 ,수정에 대한 API제공은 없다.- 클라우드기반 데이터베이스 제품이 이런식이다.
  Vector<String[]> v = new Vector<>();
  String imsi[] = { "10", "개발부", "서울" };
  v.add(imsi);
  imsi = new String[] { "20", "총무부", "인천" };
  v.add(imsi);
  for (int x = 0; x < v.size(); x++) {// 로우의 수 => 2번반복
   String[] r = v.get(x);
   for (int y = 0; y < imsi.length; y++) {// 컬럼의 수 => 3번반복

    System.out.println(r[y] + "");
   }
   System.out.println();
  }
  // 크기가 얼마인가요? 0
  // 단일 for문 처리
  Vector<String> v2 = new Vector<>();
 }
}
