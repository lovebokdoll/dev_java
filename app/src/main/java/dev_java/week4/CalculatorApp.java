package dev_java.week4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorApp extends JFrame {
 // 선언부
 JTextField jtf_display = new JTextField(10);
 JPanel jp_center = new JPanel();
 JButton jbtn_clear = new JButton("C");
 JButton jbtn_equal = new JButton("=");
 JButton jbtn_first = new JButton("1");
 JButton jbtn_plus = new JButton("+");
 JButton jbtn_minus = new JButton("-");
 JButton jbtn_mult = new JButton("*");
 JButton jbtn_div = new JButton("/");
 JButton jbtn_one = new JButton("1");
 JButton jbtn_two = new JButton("2");
 Font f = new Font("Paryrus", Font.BOLD, 30);

 // 생성부
 public CalculatorApp() {
  initDisplay();
 }

 // 화면처리기
 public void initDisplay() {
  jbtn_one.setFont(f);
  jbtn_two.setFont(f);
  jbtn_plus.setFont(f);
  jbtn_minus.setFont(f);
  jbtn_mult.setFont(f);
  jbtn_div.setFont(f);
  jbtn_equal.setFont(f);
  jbtn_clear.setFont(f);
  jp_center.setBackground(Color.orange);
  jp_center.setLayout(new GridLayout(2, 6));
  jp_center.add(jbtn_plus);
  jp_center.add(jbtn_minus);
  jp_center.add(jbtn_mult);
  jp_center.add(jbtn_div);
  jp_center.add(jbtn_equal);
  jp_center.add(jbtn_clear);
  jp_center.add(jbtn_one);
  jp_center.add(jbtn_two);
  jtf_display.setEditable(false);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.add("North", jtf_display);
  this.add("Center", jp_center);
  this.setTitle("내가만든 계산기");
  this.setSize(500, 300);
  this.setVisible(true);

 }

 public static void main(String[] args) {
  new CalculatorApp();
 }
}
