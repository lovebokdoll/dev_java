package dev_java.week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//List - java.util.List(Interface) - 구현체클래스 => ArrayList,Vector입니다.
public class Myb {
  void m(List<String> myNames) {
    System.out.println("===[List<String>]===");
    for (String s : myNames) {
      System.out.println(s);
    }
  }

  void m2(Vector<String> myNames) {
    System.out.println("===[Vector<String>]===");
    for (String s : myNames) {
      System.out.println(s);
    }
  }
  // JVM에서 제공하는 List에 대해서 구현체 클래스가 여러가지 있다.
  // 선언부와 생성부의 타입이 서로 다를 수 있다 => 권장사항!!

  public static void main(String[] args) {
    Myb myb = new Myb();
    List<String> nickName3 = new Vector<>();
    nickName3.add("사자");
    nickName3.add("호랑이");
    nickName3.add("표범");
    ArrayList<String> nickNames = new ArrayList<>();
    nickNames.add("토마토");// 0
    nickNames.add("키위");// 1
    nickNames.add("사과");// 2

    Vector<String> nickNames2 = new Vector<>();
    nickNames2.add("바나나");
    nickNames2.add("포도");
    nickNames2.add("딸기");
    myb.m(nickNames);
    myb.m(nickName3);// 12번호출(->19번은 범위가 더 작아서 호출이 안됨)
                     // list가 ArrayList보다 활용범위가 넓다 받아줄 수 있는 타입의 종류가 더 많다.
                     // List가 인터페이스라서!! -Vector,ArrayList둘다 받아줄수있음
    // myb.m2(nickNames);
    myb.m(nickNames2);
    myb.m2(nickNames2);

  }
}


@Override
public voud run(){}
A a = new A();
Thread th = new Thread(a);
th.start();