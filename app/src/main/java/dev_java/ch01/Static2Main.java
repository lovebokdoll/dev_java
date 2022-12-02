package dev_java.ch01;

class Static2 {
 int i;
}

class Static21 {
 static int i;
}

public class Static2Main {
 public static void main(String[] args) {
  Static2 static2 = new Static2();
  System.out.println(static2.i);
  System.out.println(Static21.i);
 }
}
