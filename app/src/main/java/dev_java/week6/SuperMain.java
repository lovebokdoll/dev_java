package dev_java.week6;

import org.checkerframework.checker.units.qual.s;

class Sup {
  void go() {
    System.out.println("Sup go 호출");
  }

  void stop() {
    System.out.println("Sup stop호출");
  }
}

class Sub extends Sup {
  Sub() {
    super.stop();
    this.stop();
  }

  @Override
  void stop() {
    System.out.println("Sub stop호출");
  }
}

public class SuperMain {
  public static void main(String[] args) {
    Sup sup = new Sup();
    // sup.go();
    Sub sub = new Sub();
    // sub.go();
    sup = sub;
    // 이럴때 부모가 가진 stop메소드는 은닉메소드라고 한다.
    // shadow method라고 함
    sup.stop();
    // super.stop();
    // this나 super예약어는 static이 있는 메소드 영역에서 사용 불가함 => 컴파일에러 발생함

  }
}
