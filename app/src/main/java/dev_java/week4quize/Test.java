package dev_java.week4quize;

import java.util.Scanner;

//while문 빠져나오기
public class Test {

 public void sum() {

  Scanner sc = new Scanner(System.in);

  System.out.println("1이상의 숫자를 입력하세요: ");
  int num = sc.nextInt();

  int sum = 0;
  if (num > 0) {
   int i = 1;
   while (i <= num) {
    sum += i;
    i++;
   }
   System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
  } else {
   System.out.println("숫자가 1이상이 아닙니다.");
  }
 }

 public static void main(String[] args) {
  Test t = new Test();
  t.sum();
 }
}
