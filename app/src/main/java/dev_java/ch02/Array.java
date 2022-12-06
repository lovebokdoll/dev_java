package dev_java.ch02;

public class Array {

 // 3가지 - 타입선택

 // int Deptlist[]; //배열의 선언 (-> 선언만 한것)
 // int Deptlist[] = new int[] { 10, 20, 30 };// 배열 생성 및 초기화

 public static void main(String[] args) {
  int Deptlist[];//선언
  Deptlist = new int[3];//생성

  Deptlist[0] = 10;//초기화
  Deptlist[1] = 20;
  Deptlist[2] = 30;

  System.out.println(Deptlist[0]);
  System.out.println(Deptlist[1]);
  System.out.println(Deptlist[2]);
 }

}
