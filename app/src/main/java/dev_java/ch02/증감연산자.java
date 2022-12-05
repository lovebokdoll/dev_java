package dev_java.ch02;

public class 증감연산자 {
 /*
  * static void plus() {
  * int i = 1;
  * int j = ++i;
  * 
  * } ===> 내가 작성한 코드
  */

 void methodA(int i, int j) {// cal by value -지역변수는 호출될 때 결정됨
  j = ++i;
  System.out.println(i + "," + j);
 }

 // j = i++;
 public static void main(String[] args) {
  증감연산자 p21 = new 증감연산자();
  p21.methodA(1, 2);

  int i = 1;// i=1
  // int j = ++i;// 2,1
  int j = i++;// 1,2
  System.out.println(i + "," + j);
 }
}
