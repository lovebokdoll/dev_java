package dev_java.ch03;
//java 예외처리 
//java finally 사용법
public class Finally1 {
 public static void main(String[] args) {
  int i = 10;
  int j = 2;
  j = 0;
  j = 5;
  try {
   System.out.println(i / j);// 5
  } catch (ArithmeticException e) {
   System.out.println(e.getMessage());
  } finally { // 연산의 결과가 정상이더라도 finally는 무조건 실행!
   System.out.println("finally는 무조건 실행이 된다.");
  }
 }
}
