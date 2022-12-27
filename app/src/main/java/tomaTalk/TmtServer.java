package tomaTalk;

import javax.swing.JFrame;

import dev_java.view.ActionListener;

/*
 * 1. 서버는 socket를 만든다.

2. 서버에서 ip주소와 port를 지정하여 소켓에 바인딩한다.

3. 서버는 listen상태가 되어 클라이언트의 요청을 기다린다.

4. 클라이언트의 요청을 받아드리고 데이터 송수신을 위한 소켓을 생성한다.

5. 클라이언트와 데이터를 송/수신한다.

6. 연결을 종료한다.
 */
public class TmtServer extends JFrame implements Runnable, ActionListener {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        socket.getOutputStream();//클라이언트에게 데이터 전송
        
    }
public void initDisplay(){

}
    public static void main(String[] args) {
        
    }
  
}
