package dev_java.ch01;

//java.lang폴더에 없는 클래스는 모두 import문을 작성함
import javax.swing.JFrame;

public class LoginView {
 public static void main(String[] args) {
  JFrame jf_login = new JFrame();
  // insert here
  // 로그인창의 가로길이를 담는 변수 선언
  int width = 300;
  width = 500;
  // 로그인창의 세로길이를 담는 변수 선언
  int height = 200;
  // 내가 만든 창의 타이틀바에 문자열찍기
  jf_login.setTitle("로그인 화면 ver1.0");
  // 내가 만든 창의 가로와 세로크기를 정해주는 메소드 호출
  jf_login.setSize(width, height);
  Return1 r1 = new Return1();
  jf_login.setVisible(r1.isView1());
 }
}
