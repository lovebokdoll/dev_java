package dev_java.ch01;

public class StaticExam4 {
  void init() {
    StaticExam2.j = 1;
  }

  void methodA() {
    StaticExam2.j = 3;
  }

  void methodB() {
    StaticExam2.j += 1;
  }

  public static void main(String[] args) {
    StaticExam4 se4 = new StaticExam4();
    se4.init();
    System.out.println("j  => " + StaticExam2.j);
  }
}
