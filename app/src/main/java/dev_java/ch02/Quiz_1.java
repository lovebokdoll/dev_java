package dev_java.ch02;
// 문제 1_ 1부터 10까지의 합을 구하는 프로그램을 작성하시오.

public class Quiz_1 {

  public static void main(String[] args) {
    // 합을 담을 변수 선언,지역변수니까 초기화 해야댐==>0 으로 초기화 하는 이유?답에 영향을 주면 안됨
    int sum = 0;
    // 1씩 세는 변수 선언
    int cnt = 1;
    // for (초기화(위에서 초기화 했으면 생략 가능) ; 조건식 ; 증감연산자)
    for (; cnt <= 10; cnt = cnt + 1) {
      sum = sum + cnt;// 1
      System.out.println("sum:" + sum + ",cnt:" + cnt);
    }
  }
}
