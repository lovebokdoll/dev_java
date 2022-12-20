package dev_java.week4;

import java.util.ArrayList;
//자바에서 제공하는 자료구조는 java.util폴더에 있음
import java.util.List;
import java.util.Vector;

public class List1 {
 public static void main(String[] args) {
  // List는 구현체 클래스가 아님
  // 생성부에 인터페이스가 와서 에러임 => 구현체 클래스가 와야한다.
  // List vector,arraylist
  // 왜 백터를 써야 하나? =>DefaultTableModel객체에 데이터셋을 추가하는 메소드를 제공하니까
  List<String> nameList = new Vector<>();// 멀티스레드에 안전-속도 느림
  List<String> nameList2 = new ArrayList<>();// 싱글스레드에 안전-속도 빠름
  System.out.println(nameList.size());
  boolean isOK = nameList.add("이순신");
  System.out.println(nameList.size());
  System.out.println(nameList.get(0));
  System.out.println(isOK);

 }
}
