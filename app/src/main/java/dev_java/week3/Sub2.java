package dev_java.week3;

public class Sub2 {
 public static void main(String[] args) {

  Main2 m2 = new Main2();
  
  for (int i = 0; i < m2.isOK.length; i++) {
   System.out.println(m2.isOK[i]);

  }
  System.out.println("======개선된 for문=====");
  for (boolean isOK : m2.isOK) {
   System.out.println(isOK);
  }
 }
}
