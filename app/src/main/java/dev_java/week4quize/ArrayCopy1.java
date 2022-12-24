
package dev_java.week4quize;

import java.util.Arrays;

//얕은복사 깊은복사
public class ArrayCopy1 {
 String fruit[] = { "사과", "딸기", "바나나" };
 String fruit2[]; 

 public ArrayCopy1() {
  // fruit2 = fruit;// 얕은복사 => 치환
  // fruit2[1]="키위";//복사본을 바꿈
  // System.out.println(Arrays.toString(fruit));
  // System.out.println(Arrays.toString(fruit2));
 }
public ArrayCopy1(String [] args){ //파라미터에 1차배열
 fruit2 = fruit;//여기서는 치환이 안됨
  fruit2[1]="키위";
  System.out.println(Arrays.toString(fruit));
  System.out.println(Arrays.toString(fruit2));
}
 public static void main(String[] args) {
  new ArrayCopy1();
 }
}
