package dev_java.kh_test;

public class Test2 {
 
public void method(){
 int i = 1;
 while (i <= 20) {
  if (i % 5 == 0) {
   System.out.println(i + ": 5의 배수입니다.");
  } else {
   System.out.println(i + ":5의 배수가 아닙니다.");
  }
  i++;
 }
}

 
 public static void main(String[] args) {
  Test2 t2 = new Test2();
  t2.method();
 }
}
/*
 * 5의 배수인가 아닌가
 * while은 선언부에
 * 올 수 없음=>
 * 메소드 안으로
 * 혹은 메인메소드
 * 안으로
 * break없음 =>
 * 무한루프 조심!
 * 변수에대한 증감연산자가 있어야함=>
 * 무한반복 방지 i++
 * ;
 */