package dev_java.network1;

import java.io.IOException;
import java.io.ObjectInputStream;//듣기할때 필요한 클래스
import java.io.ObjectOutputStream;//말하기할때 필요한 클래스
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

//서버를 기동하고 클라이언트가 접속해 오기를 기다린다 => 기다리면 스레드
//기다리는 것도 스레드가 있어야 한다~~
public class TimeServer extends Thread {
  // 선언부
  // 객체 직렬화가 가능하고 듣기와 쓰기가 가능한 I/O관련 클래스 선언
  ObjectOutputStream oos = null; // 소켓이 있어야만 객체생성 가능 - 말하기
  ObjectInputStream ois = null;// 소켓이 있어야만 객체생성 가능 - 듣기
  Socket client = null; // 전역변수의 위치
  // run메소드 재정의 - 스레드에서 해야 할 일을 처리함
  // 반드시 부모가 가진 메소드와 선언부가 일치해야함
  // TomeServer is a Thread관계가 성립하니까 상속처리 가능함

  // 생성자
  TimeServer() {
  }

  // 아래 생성자 필요한 이유는 서버소켓이 접속해온 클라이언트소켓을 런메소드에서 사용해야 하니까
  // 전역변수로 치환해야 한다.
  TimeServer(Socket client) {
    this.client = client; // 초기화
  }

  // 스레드 구현 메소드에서 서버소켓에 접속해온 client소켓을 가지고
  // 말하기와 듣기에 필요한 oos와 ois객체를 생성함
  // I/O도 지연과 데드락 상태에 빠질 수 있으므로 반드시 예외처리 할것.
  @Override
  public void run() {
    try {
      oos = new ObjectOutputStream(client.getOutputStream());
      ois = new ObjectInputStream(client.getInputStream());
      while (true) {
        oos.writeObject(getTimeMessage());// 12:05:45
        try {
          sleep(1000);
        } catch (InterruptedException e) {

        }
      }
    } catch (Exception e) {
    }
  }

  // 메인메소드
  public static void main(String[] args) {
    // 서버소켓 생성시 파라미터로 포드번호가 필요함
    int port = 1000;
    // 동시에 여러사람이 접속을 시도함

    // server를 메소드로 꺼내는 연습 하기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    ServerSocket server = null;
    Socket client = null;// 여기에 들어오는 소켓은 서버소켓에 접속해온 클라이언트의 소켓(주소번지)임
    try {
      server = new ServerSocket(port);
    } catch (IOException ie) {
      System.out.println("Can't bind port" + port);
      ie.printStackTrace();// 에러메시지를 라인번호와 함께 출력 - 힌트문을 디버깅할때 많이 사용
      try {
        server.close();
      } catch (Exception e) {
        System.exit(0);// 서버강제종료
      }
    } ///////////////////// end of try-catch
    System.out.println("TimeServer Started successful");
    while (true) {
      try {
        // 클라이언트가 접속해오기를 기다리다가 접속(new Socket("1.221.120.195",1000))을 해오면
        // 아래 메소드가 클라이언트 소켓정보를 취득하게 됩니다.
        client = server.accept();
        System.out.println(client.getInetAddress());// 클라이언트의 네트워크 정보
        System.out.println("New Client connected");
        // 스레드 개입이 필요함 - 1초동안 sleep(1000)호출하고 현재 시분초 정보를 출력함
        // 스레드 동작시킴 -> 스레드의 추상메소드 run을 호출해야 함
        // 주의사항 : run을 직접 호출하는게 아니라 start()호출하면 JVM이 순서를 따져서 출발시킴 = call back느낌..?
        TimeServer ts = new TimeServer(client);// 왜냐면 run에서 사용하고 싶으니까
        ts.start();// 여기서 run메소드가 호출됨
        System.out.println("New TimeServer Thread Started");
      } catch (Exception e) {
      }
    }
  }

  public String getTimeMessage() {
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    int sec = cal.get(Calendar.SECOND);
    return (hour < 10 ? "0" + hour : "" + hour) + ":" + (min < 10 ? "0" + min : "" + min) + ":"
        + (sec < 10 ? "0" + sec : "" + sec);
  }
}
