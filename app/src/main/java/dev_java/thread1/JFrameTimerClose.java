package dev_java.thread1;

import javax.swing.JFrame;

public class JFrameTimerClose extends JFrame {
  public JFrameTimerClose() {
    super("JFrame 테스트 - 5초후 창닫기");
    this.setSize(500, 500);
    this.setVisible(true);
    try {
      Thread.sleep(3000);
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
    setVisible(false);
  }

  public static void main(String[] args) {
    new JFrameTimerClose();// 생성자 호출하기
  }

}
