package dev_java.ch01;

public class Variable {
 int x;
 // 나는 파라미터가 없는 메소드 입니다.
 // 나는 리턴_반환형이 없다(void!!!)
 void methodA() {
  int i;
  i = 1;
  x = i;
  
  System.out.println("i:" + i);// 지역변수는 초기화 생략할수없음
 }

 public static void main(String[] args) {
  // insert here
  Variable variable = new Variable();
  variable.methodA();
  System.out.println("x:" + variable.x);

 }
}
