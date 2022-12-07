package dev_java.week2quiz;

import java.util.Arrays;

public class IntArray1 {
 public static void main(String[] args) {
  // 한번에 세 사람의 나이를 담으려면?
  int ages[] = new int[3];// 배열의 방 생성
  System.out.println(ages[0]);// 0
  System.out.println(ages[1]);// 0
  System.out.println(ages[2]);// 0
  System.out.println(Arrays.toString(ages));
  // 한 번에 세가지의 부서번호를 담으려면?
  int deptnos[] = { 10, 20, 30 };
  System.out.println(deptnos[0]);// 10
  System.out.println(deptnos[1]);// 20
  System.out.println(deptnos[2]);// 30
 }

}
