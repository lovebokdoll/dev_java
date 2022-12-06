package dev_java.ch02;

public class Shuffle {

 public static void main(String[] args) {
  int a = 3;
  int b = 5;
  int temporarily = 0;
  temporarily = a;
  a = b;
  b = temporarily;
  System.out.println("a:" + a + ",b" + b);
 }

}
