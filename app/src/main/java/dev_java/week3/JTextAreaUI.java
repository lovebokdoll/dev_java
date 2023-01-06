package dev_java.week3;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaUI implements ActionListener {
   // 선언부
   // 선언부에 하는것 이른인스턴스화
   JTextAreaUILogic jtaUILogic = new JTextAreaUILogic(this); // ui자신
   // Car myCar = new Sonata(); => 인스턴스화를 한번에 하는것!!!
   // 인터페이스는 반드시 구현체클래스가 있어야 한다.
   // 단독으로 인스턴스화 불가
   // 선언부와 생성부의 타입이 다르다 - 그래서 다형성이 가능 -폴리모피즘
   ActionListener al = new JTextAreaUI();

   JFrame jf = new JFrame();
   JTextArea jta = new JTextArea(10, 20);
   JTextField jtf = new JTextField(10);

   // 디폴트생성자 선언
   // 디폴트생성자는 생략이 가능하다. => JVM이 대신 해줌
   public JTextAreaUI() {
      initDisplay();
   }

   // 언제 호출되나요? 인스턴스화 할때 => 생성자도 메소드처럼 호출이 가능함 but리턴타입이 없다.
   public void initDisplay() {// ui를 그려줌
      // 이벤트소스와 이벤트핸들러클래서 매칭하기
      jtf.addActionListener(this);// =>event처리가 필요함
      // 이벤트 핸들러클래스의 주소번지
      // 멀티라인 작성 가능한 컴포넌트 배경색 설정
      jta.setBackground(Color.cyan);
      // JFrame은 디폴트 레이아웃이 BoederLayout이라서 동서남북배치가능
      jf.add("Center", jta);// JTextArea는 중앙에 배치
      jf.add("South", jtf);// 남쪽에는 JTextField 배치
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 윈도우창 x버튼 클릭시 자원회수
      jf.setSize(400, 300);// 윈도우창 가로세로 크기설정
      jf.setVisible(true);// 화면을 출력함
   }

   public static void main(String[] args) { // 가장 먼저 호출됨 -entry point임
      new JTextAreaUI(); // 생성자 호출되고 그 안에 화면 그리는 메소드 호출됨
   }

   @Override // callback method 버튼이 눌렸을때 실행
   // annotation 으로 검색해보기
   // 필요한경우 annotation = 문법적인 제약을 갖음 => 선언부가 일치해야 한다
   public void actionPerformed(ActionEvent e) {
      // 추상메소드의 파라미터를 통해서 감지된 컴포넌트의 주소번지를 얻어오는
      // getSource메소드의 소유주이다... => ActionEvent가
      Object obj = e.getSource();
      if (jtf == obj) { // JTextField에 엔터친거야?
         // JTextField에 입력한 문자열 받기
         String input = jtf.getText();
         //jta.append("JTeatAreaUI원본:" + input + "\n");
         jtaUILogic.account(input);
         jtf.setText("");
      }
   }
}
// 추상메소드 선언은 인터페이스 안에서 일어난다.
// 메소드 호출이 아닌데 ;으로 끝난다
// 디바이스(장치)가 결정되지 않았다.