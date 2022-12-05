package dev_java.ch02;

//문제 2-1_ 1부터 10까지 세면서 짝수의 합을 구하는 프로그램을 작성하시오.
//원하는 값을 넣으면 계산해주는 프로그램
import java.util.Scanner;

public class Practice_2_1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("구하고자 하는 합의 두번째 숫자를 입력하세요");
    int user_end = s.nextInt();
    int tot = 0;
    int cnt = 1;

    for (; cnt <= user_end; cnt++) {
      if (cnt % 2 == 1) {
        tot = tot + cnt;
      }
    }
    System.out.println("tot:" + tot + ",cnt:" + cnt);
    s.close();
  }
}