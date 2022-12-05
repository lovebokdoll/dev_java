package dev_java.ch02;

public class 증감연산자_1 {

 public static void main(String[] args) {
  int i = 5;
  switch (i) {
   case 0:
    ++i;// 실행문 ==> 조건을 만족하지 않아 실행 되지 않음
   case 1:
    ++i;// 실행문--break문이 없어서 default 로 진행됨!!
    break;// 2 ==>switch문 탈출
   default:// 맞는 조건이 없는 경우 default로 진행!
    ++i;
  }// end of switch -switch 는 내가 지정한 값에 해당하는 case의 수행문과 그 아래까지 전부 수행
  // insert here-i는 얼마일까요?
  System.out.println(i);
 }
}
