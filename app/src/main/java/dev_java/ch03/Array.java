package dev_java.ch03;

public class Array {
 public static void main(String[] args) {
  // 선언과 생성을 나누어 할 수 있다.
  // 이른주입인가 아니면 게으른 주입인가 알아두자
  // 이른 인스턴스화는 선언과 생성을 한번(한문장)에 작성함!!!
  // 게으른 인스턴스화는 선언과 생성을 분리함!!!!!
  int i[];
  // int j[3]=new int[3]; 이렇게 작성 할 수 없음다
  i = new int[3];
  // 여기까지는 아직 초기화가 안됨!
  // 객체배열이라면 null,null,null
  System.out.println(i[0]);
  //예외처리 이렇게 하면 된다!!try ~catch문
  try {
   //문법에러는 exception과는 상관없다 . ==> 런타임에러
   //예외가 발생할 가능성이 있는 코드 작성
   System.out.println(i[3]);
  } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("인덱스가 범위를 넘었다");
  }
  System.out.println("여기");
 }
}
