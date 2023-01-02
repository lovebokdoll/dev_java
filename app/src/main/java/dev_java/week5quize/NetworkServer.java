package dev_java.week5quize;
//ServerSocket = 동시에 많은 사람이 접속해올때 튕기지 않고 모두 받아주기위한 소켓 => 대기상태 진행

//Socket = 실제로 일하는 소켓

import java.net.ServerSocket;
import java.net.Socket;

//단일상속만 되니까 인터페이스 지원함
//인터페이스 통해 스레드 구현하는 방법
public class NetworkServer implements Runnable {

	public static void main(String[] args) {
		System.out.println("main시작");
		NetworkServer ns = new NetworkServer();
		Thread th = new Thread(ns);
		th.start();
		System.out.println("main끝");
	}

	@Override
	public void run() {
		System.out.println("Run호출성공");
		int port = 3000;
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
			// 대기상태가 진행됨 - chatclient에서 new Socket("서버",포트번호)하면 다시 진행
			System.out.println("서버소켓 생성완료 - ClientSocket 접속 기다리는중..");
			while (true) {
				// 언제 코드가 진행? new Socket("192.168.10.79",2000)
				Socket client = server.accept();
				System.out.println("Client 측 : " + client.getInetAddress());// 접속한 클라이언트 정보출력
				// 금융권에서 주로 사용 -> 보안강화 - 내부적으로 직렬화기법 적용되어있음
				// 말하기-ObjectOutputStream -> writeObject();네트워트 전송이 일어남
				// 듣기-ObjectInputStream -> readObject();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}