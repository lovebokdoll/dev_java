package dev_java.week3;

public class JTextAreaUILogic {
 // 메모리 StackOverFlow발생 - 서버가 중지됨
 // 여기서 직접 인스턴스화하면 복제본이 만들어짐 => 복제본에 출력되니까
 // JTextArea jta = new JTextArea(10,30);
 JTextAreaUI jtaUI = null;

 public JTextAreaUILogic(JTextAreaUI jTextAreaUI) {
  // 생성자 안에서 JTextAreaUI의 JTextArea원본과 전변을 초기화해주어야 한다.
  this.jtaUI = jTextAreaUI;
 }

 public void account(String input) {
  System.out.println("account호출성공");
  // JTextAreaUI클래스에 정의된 주소번지를 사용하고 싶다.
  // insert here
  jtaUI.jta.append("UILogic:" + input + "\n");
 }

}
