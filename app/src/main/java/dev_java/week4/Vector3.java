package dev_java.week4;

import java.util.Vector;

public class Vector3 {
 public static void main(String[] args) {
  // 객체는 생성되었으나 방은 없다
  Vector<Integer> v = new Vector<>();
  // 그러니까 방의 크기는 0
  System.out.println(v.size());
  // 방이 비어있니?
  System.out.println(v.isEmpty()); // true
  // 방에 1을 더해준다
  boolean isExist = v.add(1);
  // 첫번째 인덱스[0]에 뭐가 들어있니?
  System.out.println(v.get(0));
  // 1이 들어있니?
  System.out.println(isExist); // true
  // 방이 비어있니?
  System.out.println(v.isEmpty()); // false
  // 1을 포함하고 있니?
  System.out.println(v.contains(1)); // true
  // 방의 두번째 인덱스([1])에 2를 추가한다
  v.add(1, 2);
  // 방에 2가 들어있니?
  System.out.println(v.contains(2)); // true
  // 두번째 인덱스([1])를 지워준다
  System.out.println(v.remove(1)); // 지운 인덱스가 갖고있는 값을 출력함
  // 1을 지워준다
  boolean isOk = v.remove(new Integer(1));
  // 그럼 방의 크기는 ?
  System.out.println(v.size());
 }
}
