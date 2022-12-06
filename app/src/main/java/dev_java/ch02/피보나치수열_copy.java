package dev_java.ch02;

/*
 *피보나치 수열의 규칙을 만족하는 프로그램을 작성하고
 * a1에서 a10번째 항까지 출력되도록 해보세요.
 */
//앞의 두 수를 더하면 값이 나옴
//1 1 2 3 5 8
public class 피보나치수열_copy {
  void action() {
    int Preprevious = 1;// 전전항(n-2)
    int Previous = 1;// 전항(n-1)
    int Current = 0;
    System.out.print(Preprevious + " " + Previous + " ");
    for (int i = 0; i < 8; i++) {
      Current = Preprevious + Previous;
      System.out.print(Current + " ");
      Preprevious = Previous;
      Previous = Current;
    }
  }

  public static void main(String[] args) {
    // action 메소드 호출하시오
    피보나치수열_copy copy = new 피보나치수열_copy();
    copy.action();
  }
}
