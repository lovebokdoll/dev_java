package dev_java.ch02;
//문제 2_ 1부터 10까지 세면서 짝수의 합을 구하는 프로그램을 작성하시오.

public class Practice_2 {
  public static void main(String[] args) {
    int tot = 0;
    int cnt = 1;

    for (; cnt <= 10; cnt++) {
      if (cnt % 2 == 0) {
        tot = tot + cnt;
      }
      System.out.println(cnt);
    }
    System.out.println("tot:" + tot + ",cnt:" + cnt);

  }
}