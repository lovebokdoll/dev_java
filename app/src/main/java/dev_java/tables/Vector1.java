
package dev_java.tables;

import java.util.Vector;

/*ArrayList와 동일한 구조를 가지며 배열의 크기가 늘어나고, 
줄어듬에 따라서 자동으로 크기가 조절이 됩니다*/
public class Vector1 {
 public static void main(String[] args) {
  Vector v = new Vector();
  Vector<String> v2 = new Vector<>();
  Vector<Integer> v3 = new Vector<>();
  Vector<DeptVO> v4 = new Vector<>();// 3차배열 안쓴다.
  v.add(1);
  v.add("안녕");
  System.out.println(v.get(0));
  System.out.println(v.get(1));
  String insa = v.get(0);
  String insa2 = v2.get(0);

 }
}
