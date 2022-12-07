package dev_java.ch02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class RandomGameView {
 // 선언부
 JFrame jf_game = new JFrame();
 JPanel jp_east = new JPanel();
 JButton jbtn_new = new JButton("새게임");
 JButton jbtn_dap = new JButton("정답");
 JButton jbtn_clear = new JButton("지우기");
 JButton jbtn_exit = new JButton("종료");

 // 생성자-파라미터가 없는 생성자 (디폴트 생성자 : 생략가능함)
 RandomGameView() {// 그러나 화면을 그리는 메소드를 호출하기위해서 굳이 선언한것임..
  initDisplay();// 내 안에 있는 메소드임 => 인스턴스화 없이도 가능
 }

 // 화면그리기구현
 public void initDisplay() {
  jp_east.setLayout(new GridLayout(4, 1));
  jp_east.add(jbtn_new);
  jp_east.add(jbtn_dap);
  jp_east.add(jbtn_clear);
  jp_east.add(jbtn_exit);
  jf_game.add("East", jp_east);
  jf_game.setSize(450, 400);
  jf_game.setVisible(true);
 }

 // 메인메소드
 public static void main(String[] args) {
  // 생성자 호출하기 - 디폴트 생성자가 호출됨
  new RandomGameView();
 }
}
