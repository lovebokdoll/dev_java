package dev_java.ch02;

public class 증감연산자_3 {

  public static void main(String[] args) {
    int i = 1;
    int j = 2;
    // if ((i == --j) & (++i <= j)) {
    if ((i != --j) && (++i <= j)) {
      // 1 == 1 (T) && 2<=1(F)
      System.out.println("조건을 만족함");
      // insert here -> i와 j를 확인 할 수 없다!!
    } else {
      System.out.println("조건을 만족하지 않음");
    } // 조건을 만족하지 않았을 때 else로 떨어짐
      // insert here -> i는 얼마, j는 얼마일까요?
    System.out.println("i=" + i + ",j=" + j);
  }
}
// }
