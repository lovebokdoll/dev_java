package dev_java.week3quize;

/*
 * 0 부터 9사이의 임의의 수를 100개를 채번하여 한 줄에 10개씩
 * 출력하고 그 숫자의 빈도수를 계산하여 출력하시오
 * 원본 : 0 1 2 3 4 5 6 7 8 9
 *       2 5 6 8 7 8 9 0 1 1
 *       5
 *       3
 *       7
 *       9
 *       2
 *       0 4 5 6 6 7 8 8 9 9
 * 숫자 : 0 1 2 3 4 5 6 7 8 9
 *갯수 : 10 9 18 11 7 9 15 14 7 5 (편집됨) 
 */

public class Quize7 {
 int users[][] = new int[10][10];
 void random100() {
  for (int i = 0; i < users.length; i++) {
   users[i] = (int) (Math.random() * 10) - 1;
   for (int j = 0; j < users[i].length; i++) {
    users[j] = (int) (Math.random() * 10);
   }
  }
  System.out.println(i);
  System.out.println(users[j]);
 }

 public static void main(String[] args) {
  Quize7 q7 = new Quize7();
  q7.random100();
 }
}
