package dev_java.network1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JLabel;

public class TimeClient extends Thread {
  Socket socket = null;
  ObjectOutputStream oos = null;
  ObjectInputStream ois = null;
  JLabel jlb_timer = null;

  public TimeClient() {
  }

  public TimeClient(JLabel jlb_timer) {
    this.jlb_timer = jlb_timer;
  }

  @Override
  public void run() {
    // 서버로 부터 읽어온 시간정보 담기
    String timeMsg = null;
    try {
      // 아래가 실행되자마다 TimeServer의 ServerSocket이 accept()호출하여
      // 클라이언트 소켓정보를 서버가 취득함
      socket = new Socket("192.168.10.89", 2000);
      oos = new ObjectOutputStream(socket.getOutputStream());
      ois = new ObjectInputStream(socket.getInputStream());
      while (true) {
        try {
          while ((timeMsg = (String) ois.readObject()) != null) {
            System.out.println(timeMsg);
            jlb_timer.setText(timeMsg);
          } // end of inner while
          sleep(1000);
        } catch (Exception e) {
          // TODO: handle exception
        }
      }
    } catch (IOException ie) {
      System.out.println("타임서버에 접속할 수 없습니다.");
      System.out.println(ie.toString());
    } finally {
      try {
        oos.close();
        ois.close();
        socket.close();
      } catch (Exception e) {
        // TODO: handle exception
      }
    }
  }

  public static void main(String[] args) {
    // 선언부와 생성부의 이름이 다를 수 있다 => 그래야 다형성구현이 가능함
    // 자바에서는 new다음에 오는 이름으로 객체가 생성된다.
    Thread th = new TimeClient();
    th.start();// run메소드 호출
  }
}
/*
 * 클래스 설명
 * TimeServer에서 제공하는 현재 시간정보를 읽어오는 클래스를 구현
 * 그런데 스레드를 상속받은 이유는 1초마다 읽어와야 하니까
 * sleep(1000)호출해야함. 그러니까 나는 스레드여야 한다.
 * 1초마다 계속 읽어와야 하니까 무한루프돌린다. => 핸드폰 종료하면 꺼짐
 */