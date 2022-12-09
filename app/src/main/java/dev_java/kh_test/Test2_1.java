package dev_java.kh_test;

public class Test2_1 {
  public static void main(String[] args) {

    for (int i = 1; i <= 20; i++) {
      int result = i % 5;
      switch (result) {// 정수 문자열 enum(열거형)
        case 0:
          System.out.println(i + ": 5의 배수입니다.");
          break;
        case 1:
        case 2:
        case 3:
        case 4:
          System.out.println(i + ":5의 배수가 아닙니다.");
          break;
      }
    }
  }
}
