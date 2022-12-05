package dev_java.ch02;
//문제 1_ 1부터 10까지의 합을 구하는 프로그램을 작성하시오.

public class Practice_1 {

  public static void main(String[] args) {

    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum = sum + i;
      // System.out.println("1부터 10까지의 합 : " + sum);
    }
    System.out.println("1부터 10까지의 합 : " + sum);
  }
}
