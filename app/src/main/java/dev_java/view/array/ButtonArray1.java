package dev_java.view.array;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonArray1 implements ActionListener {
 // 선언부
 AccountSample action = new AccountSample(this);
 JFrame jf = new JFrame();// setSize(400,300); setVisible(true);윈도우창에 활성화 하기
 JPanel jp_center = new JPanel();
 JTextArea jta_display = new JTextArea(10, 20);
 JScrollPane jsp_display = new JScrollPane(jta_display);
 JTextField jtf_input = new JTextField();
 JPanel jp_east = new JPanel();
 JButton jbtns[] = new JButton[4];
 String jbtns_label[]={"새게임","정답","지우기","종료"}

 // 생성자
 public ButtonArray1() {
  System.out.println("디폴트 생성자 호출");
  // 이벤트 소스와 이벤트처리를 담당하는 핸들러클래스를 매핑하기
  jtf_input.addActionListener(this);// this가 가리키는것은 callback메소드
  initDisplay();
 }

 // 화면그리기
 public void initDisplay() {
  System.out.println("화면그리기 호출");

  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  jp_center.setLayout(new BorderLayout());
  jp_center.add("Center", jsp_display);
  jp_center.add("South", jtf_input);
  jp_east.setLayout(new GridLayout(4, 1, 2, 2));
  for (int i = 0; i < jbtns.length; i++) {
   jbtns[i] = new JButton(jbtns_label[i]);
   jbtns[i].addActionListener(this);
  }
  jbtns[0].setBackground(new Color(100, 200, 2));
  jbtns[0].setForeground(new Color(100, 50, 210));
  jbtns[1].setBackground(new Color(100, 200, 2));
  jbtns[1].setForeground(new Color(100, 50, 210));
  jbtns[2].setBackground(new Color(100, 200, 2));
  jbtns[2].setForeground(new Color(100, 50, 210));
  jbtns[3].setBackground(new Color(100, 200, 2));
  jbtns[3].setForeground(new Color(100, 50, 210));

  jp_center.setBackground(Color.orange);
  jf.add("Center", jp_center);
  jf.add("East", jp_east);
  jf.setSize(400, 300);
  jf.setVisible(true);
 }

 // 메인메소드
 public static void main(String[] args) {
  new ButtonArray1();
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  // e.getSource는 이벤트가 감지되는 컴포넌트(JTextField)의 주소번지를 반환함
  Object obj = e.getSource();
  // 새게임 하려고?
  if (jbtns[0] == obj) {
   jta_display.append("새게임을 시작합니다.\n");
  }
  // 정답 볼래?
  else if (jbtns[1] == obj) {
   jta_display.append("정답은 ____ 입니다.\n");
  }
  // 화면좀 지워줘.
  else if (jbtns[2] == obj) {
   jta_display.setText("");
  }
  // 그만할래.
  else if (jbtns[3] == obj) {
   // jf.dispose(); ==> 창 하나씩 닫는것
   System.exit(0);// ==>몽땅 한번에 닫을 때
  }

  // JTextField에서 엔터친거야?
  else if (jtf_input == obj) {
   // 사용자가 텍스트 필드에 입력한 문자열을 읽어옴
   String input = jtf_input.getText();
   // jta_display.append(input +":"+action.account2()+ "\n");
   action.account2();
   jtf_input.setText("");
  }
 }
}
