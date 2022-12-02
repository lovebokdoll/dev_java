package dev_java.ch01;

//class는 두개이상 올수있음 BUT public은 한개만
//protectad는 패키지가 달라도 상속관계이면 접근가능
class Param {
  int ival;// non-static 전역변수
  // 전역변수는 초기화를 생략할 수 있음,생성자가 해주니까
}

public class TestParam {
  // 선언은 되어있지만, 초기화가 되어있지 않음
  void effectParam(Param p) {// p는 @abcd 1234
    // 메소드의 파라미터 자리는 지역변수
    // 메소드 안에서 선언을 했다(?)
    p = new Param();// 주소번지 @abcd 1235넘긴다
    p.ival = 500;
    System.out.println("sub ival ===> " + p.ival);
  }

  public static void main(String[] args) {
    TestParam tp = new TestParam();
    Param p = new Param();// 지역변수
    p.ival = 100;
    tp.effectParam(p);// 주소번지 @abcd 1234넘긴다
    System.out.println("main ival ===> " + p.ival);
  }
}