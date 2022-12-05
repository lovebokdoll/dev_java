package dev_java.ch02;
/*문제 3.
1부터 100까지 세면서 5의 배수이면 fizz를 출력하고
7의 배수이면 buzz를 출력하고
5와 7의 공배수이면 fizzbuzz를 출력하고 나머지는 숫자를 출력하는 프로그램을 작성하시오.*/

public class Practice_3 {
  void methodA() {
    for (int i = 1; i < 101; i++) {
      switch (i % 35) {
        case 0:
          System.out.println("fizzbuzz");
          break;
        case 5:
        case 10:
        case 15:
        case 20:
        case 30:
          System.out.println("fizz");
          break;
        case 7:
        case 14:
        case 21:
        case 28:
          System.out.println("buzz");
          break;
        default:
          System.out.println(i);
      }/// end of switch
    } /// end of for
  } ///// end of method A

  public static void main(String[] args) {
    Practice_3 fbg = new Practice_3();
    fbg.methodA();
    for (int i = 1; i < 101; i++) {
      if (i % 35 == 0) {
        System.out.println("fizzbuzz");
      } else if (i % 5 == 0) {
        System.out.println("fizz");
      } else if (i % 7 == 0) {
        System.out.println("buzz");
      } else
        System.out.println(i);
    }
  }
}
