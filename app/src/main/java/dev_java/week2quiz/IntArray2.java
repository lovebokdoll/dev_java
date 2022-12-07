package dev_java.week2quiz;

public class IntArray2 {
 public static void main(String[] args) {
  // 한번에 세 사람의 나이를 담으려면?
  int ages[] = new int[3];
  ages[0] = 1;// 배열 초기화
  ages[1] = 2;
  ages[2] = 3;
  System.out.println(ages[0]);// 1
  System.out.println(ages[1]);// 2
  System.out.println(ages[2]);// 3
  // 한 번에 세가지의 부서번호를 담으려면?
  int deptnos[] = { 10, 20, 30 };
  System.out.println(deptnos[0]);// 10
  System.out.println(deptnos[1]);// 20
  System.out.println(deptnos[2]);// 30
 }
}
