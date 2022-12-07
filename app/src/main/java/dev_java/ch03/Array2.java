package dev_java.ch03;

import java.util.Arrays;

public class Array2 {
 // 이른인스턴스화 => 선언과 생성을 같이 한것!!!
 int i[] = new int[3];// 0,0,0
 int j[] = new int[] { 1, 2, 3 };// 1,2,3
 int x[] = { 1, 2, 3 };// 1,2,3

 //변수-원시배열-객체배열-자료구조(List,Map)-쿠키와 세션
 public static void main(String[] args) {
  Array2 a2 = new Array2();// for문안에서 쓰려면 인스턴스화 해주야댐
  System.out.println(a2.x.toString());
  System.out.println(Arrays.toString(a2.i));// 덩어리째 찍어볼수 있는방법도 있다~~
  System.out.println(Arrays.toString(a2.j));
  System.out.println(Arrays.toString(a2.x));
  for (int a = 0; a < a2.j.length; a++) {
   System.out.println(a2.j[a]);
  }
  // 개선됨 for문
  for (int y : a2.x) {
   System.out.println(y);
  }
 }
}