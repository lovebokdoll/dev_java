package tomaTalk;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 1. 서버는 socket를 만든다.

2. 서버에서 ip주소와 port를 지정하여 소켓에 바인딩한다.

3. 서버는 listen상태가 되어 클라이언트의 요청을 기다린다.

4. 클라이언트의 요청을 받아드리고 데이터 송수신을 위한 소켓을 생성한다.

5. 클라이언트와 데이터를 송/수신한다.

6. 연결을 종료한다.
 */
public class TmtServer extends JFrame implements Runnable, ActionListener {

    // 선언부
    TmtServerThread tmt = null;
    List<TmtServerThread> globalList = null;// 동시접속 할때 안전하게 벡터로
    ServerSocket server = null;
    Socket socket = null;//client와 통신하기 위해 생성
    JTextArea jta_log = new JTextArea(20, 20);
    JButton jbtn_log = new JButton("로그저장");

    // 생성자
    public TmtServer() {

    }

    // 화면처리부

    public void initDisplay() {
        jbtn_log.addActionListener(this);
        this.add("North", jbtn_log);
        this.setSize(500, 400);
        this.setVisible(true);
    }

    // 메인메소드
    public static void main(String[] args) {
        TmtServer ts = new TmtServer();
        ts.initDisplay();
        Thread th = new Thread(ts);
        th.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        // socket.getOutputStream();// 클라이언트에게 데이터 전송
        globalList = new Vector<>();
        boolean isstop = false;
        try {
            
            server = new ServerSocket(1000);
            jta_log.append("Server Ready\n");
            while (!isstop) {
                socket = server.accept();
                jta_log.append("client info" + socket);
                jta_log.append("client address" + socket.getInetAddress());
                TmtServerThread tst = new TmtServerThread(this);
                tst.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
