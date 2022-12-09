package dev_java.kh_test;

import java.util.Scanner;

public class Test1 {

  public void count() {
    Scanner sc = new Scanner(System.in);
    boolean isOK = false;
    while (!isOK) {
      System.out.print("문자열을 입력해주세요:");
      String str = sc.nextLine();
      if ("exit".equals(str)) {
        // equals(object) => for문의 조건식 자리 or if문 안에와야한다.!!
        // 원시형 일때는 사용하지 않는다~~
        break;// 무한반복 방지 , while문 탈출하기
      } else {
        System.out.println(str.length() + "글자입니다.");
      }
    } // end of while
    sc.close();
    System.out.println("프로그램을 종료합니다.");
  }// end of count

  public static void main(String[] args) {
    Test1 t1 = new Test1();
    t1.count();
  }
}
// 1."System.out.println("프로그램을 종료합니다.");​ " 의 위치가 잘못되었다.
// 2.while문안에 false가 아니라 true가 들어가야한다
/*
 * scanner
 * 
 * system// 내가 사용하는 컴터
 * out// 내가 출력장치
 * println // 출력하고자하는 내용들
 * length()=>동사형 length=>
 * 
 * 원소의 사이즈
 * 
 * 값 비교의
 * 두가지 방법 1. 1==1;(반환타입 boolean)/1=1(대입연산자 반환타입 없음)2.
 * 주소번지 비교하는것, 값을
 * 비교하고 싶으면
 * String
 * 인스턴스변수.equals()클래스변수.equals()=>static ststem.exit(0);=>
 * 프로그램 종료
 * 
 * while문 안에는 boolean=>
 * c참일때만
 * 실행
 */