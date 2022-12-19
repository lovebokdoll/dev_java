package dev_java.week4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Button1 extends JFrame {
 // 선언부
 Button1Event bevent = new Button1Event(this);// 상속,추상클래스,인터페이스중심 코딩전개
 JButton jbtn_ins = null;// 생성자 호출 안됨 => 게으른인스턴스
 // 남쪽배치
 JButton jbtn_upd = new JButton("수정");// 선언 동시에 생성자 호출 =>이른인스턴스
 // 생성자

 Button1() {
  // System.out.println("Button1디폴트생성자 호출성공" + jbtn_ins);
  // 생성자 안에서 버튼객체 생성하면 뭐가 어떻게 다른걸까?
  // => 시점에 따라 NullPointerException 발생 할 수 있다.
  jbtn_ins = new JButton("입력");
  initDisplay();// new Button1()이 호출되면 자동으로 호출이 일어남
  // System.out.println("initDisplay 호출 후" + jbtn_ins == null);

  // System.out.println("initDisplay 입력버튼 생성 후" + jbtn_ins == null);
 }

 // 화면처리부
 public void initDisplay() {
  jbtn_upd.addActionListener(bevent);
  // System.out.println("initDisplay 호출성공");
  JButton jbtn_del = new JButton("삭제"); // 동쪽배치
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  if (jbtn_ins != null) {
   this.add("North", jbtn_ins);
  }

  this.add("South", jbtn_upd);
  this.add("East", jbtn_del);
  this.setSize(400, 300);
  this.setVisible(true);
 }
}

class Button1Event implements ActionListener {
 Button1 button1 = null;

 public Button1Event(Button1 button1) {
  this.button1 = button1;
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  Object obj = e.getSource();
  if (obj == button1.jbtn_upd) { // NullPointerException
   System.out.println(button1.jbtn_upd.getText() + "수정");
  }
 }

}

public class Button1Main {
 public static void main(String[] args) {
  Button1 b1 = new Button1();
 }
}
