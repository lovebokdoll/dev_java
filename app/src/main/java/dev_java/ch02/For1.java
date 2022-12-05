package dev_java.ch02;

public class For1 {

  public static void main(String[] args) {
    for (int i = 1; i <= 3; i++) {
      System.out.println(i);
    }
    int i = 0;// 이케 새로 선언해줘야댐
    while (i <= 3) {// for 문 안에서 선언된 변수는 for문 안에서만 사용가능!!
      System.out.println(i);// 무한루프~~~~
      //조건식에 사용된 변수에 증감연산자가 있는지 반드시 확인 ㄱㄱ
      i++;
      ++i;
    }
  }
}