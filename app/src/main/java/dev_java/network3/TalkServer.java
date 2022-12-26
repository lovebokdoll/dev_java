package dev_java.network3;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//선언과 생성을 분리하는 코딩 전개
//자바는 단일상속만 가능함
//자바는 단일상속의 단점을 보완하기 위해 인터페이스는 다중으로 처리가능함(구현체클래스)
//상속을 받거나 implements하면 부모클래스나 인터페이스가 정의하고 있는 메소드를 
//재정의 할 수 있다(Overriding-선언부는 완전 일치해야함)
//인터페이스는 오로지 추상메소드만 갖는다-> Runnable도 인터페이스니까 추상메소드가 있다
//그게 run메소드이다.

public class TalkServer extends JFrame implements Runnable, ActionListener {
	// 선언부
	//클라이언트측에서 new Socket하면 그 소켓정보를 받아서 쓰레드로 넘김
	TalkServerThread tst = null;
	//동시에 여러명이 접속하니까 List - Vector<>(); 멀티스레드 안전, 속도  느림
	List<TalkServerThread> globalList = null;
	ServerSocket server = null;
	Socket socket = null;
	JTextArea jta_log = new JTextArea(10, 30);
	JScrollPane jsp_log = new JScrollPane(jta_log, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JButton jbtn_log = new JButton("로그저장");
​
	// 생성자
	public TalkServer() {
		//initDisplay();//시점문제- 스케쥴링
	}
​
	// 화면그리기
	public void initDisplay() {
		jbtn_log.addActionListener(this);
		this.add("North", jbtn_log);
		this.add("Center", jsp_log);
		this.setSize(500, 400);
		this.setVisible(true);
	}
​//스레드가 두개이므로 화면요청과 start()순서를 바꾸더라도 각자 처리가 됨
	public static void main(String[] args) {
		TalkServer ts = new TalkServer();
		ts.initDisplay();
		Thread th = new Thread(ts);//스레드 생성시 파라미터로 TalkServer객체를 넘김
    //스레드 pool에 있는 스레드중에서 우선순위를 따지고 차례대로 입장한다.(ready상태)
    //==> 우선순위때문에 직접입력하지 않고 메소드를 호출
		th.start();//52번 호출됨 - 지연발생함 - 클라이언트가 접속할때까지 기다림...
	}
​
	// 서버소켓과 클라이언트 소켓을 연결
	@Override
	public void run() {
		//서버에 접속해온 클라이언트 스레드 정보를 관리할 벡터 생성하기 
    //벡터는 멀티스레드 안전 => 서버에 동시접속자수가 여러명이니까 
    //그래서 백터안에는 클라이언트를 관리하는 스레드를 추가해야 한다.
    //그 스레드는 메세지를 듣고 (청취하고) 들은 내용을 그대로 클라이언트측에 내보냄.
    //200#토마토#오늘스터디할까? StringTokenizer st = new StringToknizer("","#")
    //st.nextToken(): String -200
    //st.nextToken(): String -토마토 -> 닉네임
    //st.nextToken(): String -오늘스터디할까? -> 메세지
		globalList = new Vector<>();//멀티스레드안전해서 ArrayList대신 사용함
		boolean isStop = false;
    //try-catch블록쓰는 이유 => 네트워크는 항상 장애가 발생할 수 있음 :예외처리
    //try-catch사이에는 예외가 발생할 가능성이 있는 코드 넣는다.
    //콜백함수란? 시스템에서 필요할 때 대신 호출해주는 메소드.. ActionPerforned같은것
    //run메소드는 언제 호출되나요? ==> 스레드 인스턴스변수.start(); 요청하면
    //왜이렇게 처리하나요? ==> 여러스레드가 존재하고, 경합이 벌어지므로 우선순위를 따져가며 호출해야한다. 
    //run메소드는 어떻게 호출되나요? ==> 
    //run메소드는 왜 반드시 재정의 해야하나요? ==>  
		try {
			server = new ServerSocket(3000);//서버포트번호 설정하기
			jta_log.append("Server Ready.........\n");//대기 탐 - 멈춤 - wait
			while(!isStop) {//언제 while문안으로 진입? -> net Socket(서버의 ip,port)
				socket = server.accept();
				jta_log.append("client info:"+socket+"\n");				
				jta_log.append("client info:"+socket.getInetAddress()+"\n");			
				TalkServerThread tst = new TalkServerThread(this);
				tst.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//////////////////////// [[ end of run ]] /////////////////////////
​
	@Override
	public void actionPerformed(ActionEvent e) {
		//로그를 파일로 저장하기
		
	}
}

/*
 * 채팅서버 구축하기
 * 클라이언트측에서 접속하면 접속해온 정보를 서버측화면에서 볼 수 있다.(Jframe상속-로그남김)
 * 자바는 단일상속만 가능함(클래스 두개 동시상속할 수 없음 )=>이러한 약점을 인터페이스로 지원함 -> 그래서 다중인터페이스 구현체는 가능함
 * 1.Thread상속하기
 * 2.Runnable 인터페이스 implements하기
 * 현재 TalkServer는 JFrame을 상속받오 있어서 Runnable을 implements하였음
 */