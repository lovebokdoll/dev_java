
package dev_java.design;

public class WoodDuck extends Duck {
  public WoodDuck() {
    // 설계한 객체가 어떤 특성을 가지고 어떨게 활동하는지 결정됨 -> 초기화 -> 생성자
    quackBehavior = new MuteQuack();
    flyBehavior = new FlyNoWay();// 날수 없다
  }

  @Override
  public void display() {
    System.out.println("나는 물오리 입니다.");
  }

}
