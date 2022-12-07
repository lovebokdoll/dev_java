package dev_java.ch03;

import java.util.Arrays;

public class Array3 {
 public static void main(String[] args) {
  int i[] = { 1, 2, 3 };
  int j[];// 생성이 안됨-선언만 한것
  j = i;// 생성이 안된상태에서 치환
  int k[];
  k = new int[3];// 새로생성
  j = k; // 새로운것을 치환하니까 0,0,0 나옴
  System.out.println(Arrays.toString(j));
  System.out.println(j.length);

  String s1 = "안녕";
  String s2 = s1;
  System.out.println(s2);
 }
}