package dev_java.week3;

public class Sub1 {
 public static void main(String[] args) {

  Main1 m1 = new Main1();
  for (int i = 0; i < m1.isOK.length; i++) {
   System.out.println(m1.isOK[i]);

  }
  System.out.println("======개선된 for문=====");
  for (boolean isOK : m1.isOK) {
   System.out.println(isOK);
  }
 }
}
