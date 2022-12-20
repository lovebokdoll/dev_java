package dev_java.week4;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class List2 {
 public static void main(String[] args) {
  // 자료구조를 지원하는 클래스들은 오브젝트의 존재유무 체크
  // 포함여부
  // 비어있는지 혹은 채워져있는지 확인할 수 있는 api제공하고 있다
  List<String> fruitList = new Vector<>();// 멀티스레드에 안전-속도 느림
  fruitList.add("복숭아");// 0
  fruitList.add("귤");// 1
  // boolean isExist = fruitList.contains("바나나");
  boolean isExist = fruitList.contains("복숭아");
  if (isExist) {
   System.out.println("들어있다");
  } else {
   System.out.println("들어있지 않다");
  }
  boolean isEmpty = fruitList.isEmpty();
  System.out.println(isEmpty);
  //Vector , ArrayList는 오브젝트 추가, 꺼내는 기능 제공
  //Iterator는 그 안에 오브젝트 존재유무
  Iterator<String> iter = fruitList.iterator();
  while (iter.hasNext()) {
   String fname = iter.next();
   System.out.println(fname);
  }
//제네릭방식 

  Iterator iter2 = fruitList.iterator();
  while (iter2.hasNext()) {
   //다이아몬드연산자의 의미임 => 타입을 명시적으로 작성하는것 권장
   String fname = (String)iter2.next();//터지는 이유?? 제네릭타입을 지정하지 않아서
   System.out.println(fname);
  }
//아래와 같이 사용할 수 없다
//왜냐면 Vector의 제네릭타입이 String이니까
  Iterator<Object> iter3 = fruitList.iterator(); 
  Iterator<String> iter4 = fruitList.iterator();  //=> 이렇게 타입을 맞춰줘야 한다.
  while (iter3.hasNext()) {
   //다이아몬드연산자의 의미임 => 타입을 명시적으로 작성하는것 권장
   String fname = (String)iter3.next();//터지는 이유?? 제네릭타입을 지정하지 않아서
   System.out.println(fname);
  }
 }
}
