package dev_java.ch01;

public class Staticexam5 {
 class B1 {
  static int i = 1;
 }

 class B2 {
  void methodA() {
   B1.i = 2;
  }
 }

 public class StaticExam5 {
  public static void main(String[] args) {
   B2 b2 = new B2();
   b2.methodA();
   System.out.println(B1.i);// 2출력
  }
 }
}
