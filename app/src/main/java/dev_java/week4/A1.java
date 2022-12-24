package dev_java.week4;

import java.util.Vector;

public class A1 {
 int ival = 1;

 public static void main(String[] args) {
  // Vector<Integer> v = new Vector<>();
  // 이 경우 원시형이 들어가기 때문에
  // System.out.println(v.get(0));을 하면 값이 나오지만
  // Vector<A1> v = new Vector<>();
  // 이 경우는 객체가 들어가기 때문에 System.out.println(v.get(0))하면주소번지....가 출력
  // System.out.println(v.get(0).ival); 이렇게 두번 접근해야 한다
  Vector<A1> v = new Vector<>();
  A1 a1 = new A1();
  a1.ival = 10;
  v.add(a1);

  System.out.println(a1);

  a1 = null;

  a1 = new A1();
  a1.ival = 20;
  v.add(a1);

  System.out.println(a1);

  System.out.println(v.get(0).ival);
  System.out.println(v.get(1).ival);

 }
}
