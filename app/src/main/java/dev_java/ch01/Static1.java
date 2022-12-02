package dev_java.ch01;

public class Static1 {
 // 메인메소드보다 우선순위가 높다
 // 메인메소드 호출했을 때만 찍힘
 static {
  System.out.println("stastic 블록 호출");
 }

 // main스레드라고 한다.
 // main은 entry point이다.
 // main은 개발자가 호출하는 메소드가 아니다
 // 시스템이 자동으로 호출해준다 -콜백메소드
 // main메소드에 코딩하는것은 좋지 않음
 public static void main(String[] args) {
  System.out.println("main 호출");
 }
}