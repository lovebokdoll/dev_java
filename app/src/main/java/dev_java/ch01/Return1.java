package dev_java.ch01;

public class Return1 {
 void m() {

 }

 int m1() {
  return 10;
 }

 double m2() {
  return 15;
 }

 boolean isView() {
  return false;
 }

 boolean isView1() {
  boolean bool = true;
  return bool;
 }

 String getName() {
  String name = "나";
  return name;
 }

 public static void main(String[] args) {
  Return1 r1 = new Return1();
  boolean x = r1.isView1();
  String y = r1.getName();
  System.out.println(r1.isView1());
  System.out.println(r1.getName());

 }

}
