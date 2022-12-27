
package dev_java.network3;

import javax.swing.JFrame;

public class BananaServer extends JFrame {
  // 생성자
  public BananaServer() {
    initDisplay();
  }

  BananaServer(String title) {
    super(title);
    initDisplay(title);
    // this는 BananaServer가리키는것임
    // this(title); =>자기자신을 호출하는 것이므로 에러임
  }

  public void initDisplay(String title) {
    this.setTitle(title);
    this.setVisible(true);
    this.setSize(400, 300);
  }

  public void initDisplay() {
    this.setTitle("바나나톡");
    this.setVisible(true);
    this.setSize(400, 300);
  }

  public static void main(String[] args) {
    //생성자 파라미터에는 this말고도 다른타입을 정의할수 있다.
    new BananaServer("생성자 파라미터로 제목을 결정함 - 초기화");

  }
}
/*
 * 관전포인트
 * initdisplay를 메인메소드에서 호출하는것과, 생성자안에서 호출하는것이 가능하다.
 * 둘의 차이는?
 * 작업지시서
 * 키위톡은 메인에소드에서 initDisplay호출
 * 바나나톡은 생성자에서 initDisplay호출
 */