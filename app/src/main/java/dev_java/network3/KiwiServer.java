package dev_java.network3;

import javax.swing.JFrame;

public class KiwiServer extends JFrame implements Runnable {
  // 선언부

  // 생성자
  public KiwiServer() {
    System.out.println("KiwiServer 디폴트생성자 호출");
  }

  public void initDisplay() {
    this.setTitle("키위톡");
    this.setVisible(true);
    this.setSize(400, 300);
  }

  // 메인메소드
  public static void main(String[] args) {
    KiwiServer kServer = new KiwiServer();
    kServer.initDisplay();
    Thread th = new Thread(kServer);
    th.start();
  }

  @Override // 일반메소드로 처리할때와 다른점 - 늦게라도 실행됨 -일반메소드는 어플이 종료되면 보장 못함
            //개별적으로 동작
  public void run() {// 경합이 벌어지는일 , 지연이 필요한 일
System.out.println("run호출성공");
    // TODO Auto-generated method stub

  }
}
