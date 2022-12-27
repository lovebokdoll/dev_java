
package dev_java.design;

public class MallardDuck extends Duck {
  public MallardDuck() {
    //게으른 인스턴스화 <-> 이른인스턴스화
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings(); 
  }

  public void display() {
    System.out.println("저는 물오리입니다.");
  }

}
