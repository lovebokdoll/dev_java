package dev_java.tables;

import java.util.Arrays;
/*
 * 깊은 복사의 경우 객체의 실제값을 새로운 객체로 복사하는 것=>복사하는 것
 * 얕은 복사의 경우 객체의 주소값만을 복사하는 것 => 여러 객체가 참조합니다
 * 
 */

public class ArrayCopy1 {
 void deepCopy2() {
  int[] org = { 1, 2, 3, 4, 5 };
  int[] org_copy = Arrays.copyOf(org, 2);//부분복사 할 때
  org_copy[1] = 5;
  for (int e : org) {
   System.out.println(e);
  }
  System.out.println("==================");
  for (int e : org_copy) {
   System.out.println(e);
  }
 }

 void deepCopy() {
  int[] org = { 1, 2, 3 };
  int[] org_copy = org.clone();//전체복사 할 떄
  org_copy[2] = 5;
  for (int e : org) {
   System.out.println(e);
  }
  System.out.println("==================");
  for (int e : org_copy) {
   System.out.println(e);
  }
 }

 public static void main(String[] args) {
  ArrayCopy1 ac1 = new ArrayCopy1();
  ac1.deepCopy2();
  /*
   * int[] org = { 1, 2, 3 };
   * int[] org_copy = org;
   * org_copy[2] = 5;
   * for (int e : org) {
   * System.out.println(e);
   * }
   * System.out.println("==================");
   * for (int e : org_copy) {
   * System.out.println(e);
   * }
   */
 }
}

/*
 * 배열복사
 * 얕은복사
 * :복사된 배열이나 원본배열이 변경될때 서로간의 값이 같이 바뀐다
 * 깊은복사
 * 
 */