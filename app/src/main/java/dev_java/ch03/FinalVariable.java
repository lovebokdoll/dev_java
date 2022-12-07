package dev_java.ch03;

public class FinalVariable {
 static void methodA() {
  final double PIE = 3.14; // 변수선언 앞에 final을 붙이면 재정의(재할당)가 안됨!
  //따라서 바뀌어서는 안되는것을 선언 할 때 사용함
  PIE = 5.45;// PIE에 오류~~~
 }

 public static void main(String[] args) {
  FinalVariable.methodA();
  System.out.println(PIE);
 }
}
