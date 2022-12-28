package dev_java.week5;

class Sup {
  Sup() {// 부모디폴트 생성자 선언하기

  }

  public void m() {

    System.out.println("Sup m()호출");
  }
}

class Sub extends Sup {
  Sub() {// 자손 디폴트 생성자 선언하기
    this.m();//

  }

  @Override
  public void m() {
    System.out.println("Sub m()호출");
  }
}

public class SupNSubMain {
  public static void main(String[] args) {
    Sup sup = new Sup();//
    // sup.m();
    Sub sub = new Sub();//SUb m()
    // sub.m();
    // 선언부와 생성부가 다른 경우 코드
    Sup sup2 = new Sub();//SUb m()
    // 부모의 메소드는 shadow메소드가 됨당 ㅇㅅㅇ
    // sup2.m();//같은 메소드를 재정의 했으니까 5번이 아닌 12번이 출력된다~~
    sub = ( Sub)sup2; //sub = new Sup();
    sub.m();

  }
}
