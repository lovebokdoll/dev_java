package dev_java.design;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    // 삑삑인지 무음인지 꽥꽥인지 언제 누가 어디서 결정?
    // 언제? 해당기능이 요청될때
    // 누가? 구현하고자 하는 객체가 무엇인가에 따라서 Duck myDuck = new WoodDuck();
    // 누가? 구현하고자 하는 객체가 무엇인가에 따라서 Duck myDuck = new RubberDuck();
    // 누가? 구현하고자 하는 객체가 무엇인가에 따라서 Duck myDuck = new MallardDuck(); 생성부에서 결정

    System.out.println("꽥꽥");
  }

}
