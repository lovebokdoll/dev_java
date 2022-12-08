package dev_java.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomGameDemo implements ActionListener {
  // 선언부
  JFrame jf = new JFrame();
  // 남쪽에 붙임
  JTextField jtf_input = new JTextField(5);// 생성자 파라미터는 int
  // 중앙에 붙임
  JTextArea jta_display = new JTextArea(10, 20);// 생성자 파라미터는 int
  JScrollPane jsp_display = new JScrollPane(jta_display,
      JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
  // 생성자

  public RandomGameDemo() {
    System.out.println("디폴트생성자 호출성공");
    initDisplay();
  }

  // 화면처리부
  public void initDisplay() {
    System.out.println("initDisplay 호출");
    jtf_input.requestFocus();
    jtf_input.addActionListener(this);
    jta_display.setEditable(false);
    jf.add("South", jtf_input);
    jf.add("Center", jsp_display);
    jf.setSize(300, 400);
    jf.setVisible(true);
  }

  public static void main(String[] args) {
    new RandomGameDemo();
  }
  // 선언부 없이 생성자만 호출할 수 있다. 인스턴스변수 재사용할 일이 없다면 괜찮음
  // new RandomGameView(); ==> 복제본이 생성됨, 그러나 다른객체임

  @Override
  public void actionPerformed(ActionEvent e) {
    // enter의 주소번지를 가져온다.
    // System.out.println(e.getSource());// @abcd1234
    Object obj = e.getSource();
    if (jtf_input == obj) {
      System.out.println("사용자가 입력한 값은" + jtf_input.getText());
      jta_display.append(jtf_input.getText() + "\n");
      jtf_input.setText("");// 지우기는 더블쿼테이션으로 대체함
    }
  }
}
