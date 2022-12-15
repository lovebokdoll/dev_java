package dev_java.week3quize;

import java.util.Arrays;

/*-10에서 10사이의 정수 10개를 랜덤하게 채번하여  음수와 양수의 합계를 구하는 프로그램을 작성하시오.
출력)
배열 : 9 -2 -3 8 0 -3 -8 -6 -2 0
음수합 : -24
양수합 : 17 */
public class Quize6 {

 void Random() {
  int[] users = new int[10];
  int sum1 = 0;
  int sum2 = 0;
  for (int i = 0; i < users.length; i++) {
   users[i] = (int) (Math.random() * 20) % 21 - 10;
   if (users[i] < 0) {
    sum1 += users[i];
   } else if (users[i] > 0) {
    sum2 += users[i];
   } // END OF IF
  } // END OF FOR
  System.out.println("배열 :" + Arrays.toString(users));
  System.out.println("음수의 합:" + sum1);
  System.out.println("양수의 합:" + sum2);
 }

 public static void main(String[] args) {
  Quize6 q6 = new Quize6();
  q6.Random();
 }
}
