package dev_java.week2quiz;
///Question 28 : this.x 와 x의 차이점
public class Test {
  int x = 12;// 전역변수

  public void method(int x) { // <---지역변수
    x += x; // x = x + x; => x = 5 + 5;
    System.out.println(x);
  }

  public static void main(String[] args) {
    Test t = new Test();// test인스턴스화
    t.method(5);// int x=5
  }
}
