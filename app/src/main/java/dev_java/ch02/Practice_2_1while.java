package dev_java.ch02;

//문제 2-1_ 1부터 10까지 세면서 짝수의 합을 구하는 프로그램을 작성하시오.

public class Practice_2_1while {
  public static void main(String[] args) {

    int tot = 0;// 짝수값을 담을 변수 선언
    int cnt = 1;
    // while 문 사용
    while (cnt <= 10) {
      // 반복될때마다 1씩증가
      cnt++;
      if (cnt % 2 == 0) {
        tot += cnt;// num += 100 은 num = num + 100
        System.out.println("tot:" + tot + ",cnt:" + cnt);
      }
    }
  }
}