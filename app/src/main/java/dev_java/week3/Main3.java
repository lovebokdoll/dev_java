package dev_java.week3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main3 {
 JFrame jf = new JFrame();
 Sub3 sub3 = new Sub3(this);

 public void initDisplay() {
  jf.setTitle("main3");
  jf.setSize(400, 300);
  jf.setVisible(true);
 }

 public Main3() {
  initDisplay();
 }

 public void refresh() {
  System.out.println("refresh()-나 호출되었어");
  JOptionPane.showMessageDialog(jf, "새로고침 처리 되었습니다");
 }

 public static void main(String[] args) {
  new Main3();
 }
}
