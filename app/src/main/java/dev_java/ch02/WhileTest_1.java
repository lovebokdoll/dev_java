package dev_java.ch02;

public class WhileTest_1 {
 public static void main(String[] args) {
  int i = 1;
  int hap = 0;
  while (i < 6) {
   hap = hap + i;
   System.out.println("i : " + i);
   System.out.println("hap : " + hap);
   i++;
  }
  System.out.println("1부터 5  까지의합은 " + hap);

 }
}