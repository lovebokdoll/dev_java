package dev_java.week2quiz;

//Question 39 : static으로 선언된 메소드
public class A {

 public int counter = 0;

 public static int getInstanceCount() {
  return counter;
 }

 public A() {
  counter++;
 }

 public static void main(String[] args) {
  A a1 = new A();
  A a2 = new A();
  A a3 = new A();
  System.out.println(A.getInstanceCount());
 }
}
