package dev_java.design;
//단독으로 인스턴스화 불가 - 구현체 클래스 있어야 한다.
//QuackBehavoir qb = new MuteQuack;
//QuackBehavoir qb = new Quack;
//QuackBehavoir qb = new squack; => 이런식으로 ~~
public interface QuackBehavior {
  //메소드 선언시 추상클래스와는 다르게 abstract 예약어 생략할 수 있다
  // 왜냐면 인터페이스는 추상만 가능하니까
public void quack(); 
}
