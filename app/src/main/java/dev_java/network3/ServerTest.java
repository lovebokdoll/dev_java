package dev_java.network3;

public class ServerTest {
  public static void main(String[] args) {
    //아래중에서 생성자안에 메소드호출구문이 있는쪽은 어디 인가요
    //인스턴스화를 하면 생성자(디폴트)도 호출된다.
    BananaServer bServer = new BananaServer();

      //인스턴스화를 하면 생성자(디폴트)도 호출된다.
    KiwiServer kServer = new KiwiServer();

  }
}
