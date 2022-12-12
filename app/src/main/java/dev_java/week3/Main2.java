package dev_java.week3;

public class Main2 { // 메소드 통해서 가져오기
 int i = 1;// 전역변수 i
 boolean isOK[] = null;

 // 디폴트 생성자는 생략이 가능하다
 // 그러나 지금은 isOK배열의 생성을 위해 getIsOk()를 경유하도록 해야지
 // NullPointE피할 수 있다
 public Main2() {
  System.out.println("main2()디폴트 생성자 호출 성공");
  getIsOk();
 }

 // 선언과 동시에 인스턴스화를 하지 않는 경우 :게으른 인스턴스화
 // 선언과 생성 동시에 하지 않고 메소드 통해서 객체주입을 받을 수 있음
 // 이럴경우 메소드안에서 if문을 통해 null체크를 할 수 있어 싱글톤 패턴으로 객체를
 // 주입 받을 수 있어 현업에서 선호함
 boolean[] getIsOk() {
  if (isOK == null) {
   isOK = new boolean[3];// 초기화
  }
  return isOK;
 }

 public static void main(String[] args) {

 }

}
