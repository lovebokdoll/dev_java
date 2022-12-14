package dev_java.week3;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//기본패키지인 java.lang이외에는 모두 import필요
public class Sub3 implements ActionListener {
 // 선언부 - 전역변수의 위치
 // 선언에서 결정되는건 ? 타입만 결정되었다.
 // 원시형에서는 NullPionterExecption이 있을 수 없음 => 참조형(class)가 아니기 떄문에
 // class인 경우에만 NullPionterExecption
 Main3 main3 = null;// 선언만했음 => null의 의미는 결정되지 않았다. => 원본사용
 // Main3 main3 = new Main3();// 선언도 했도 생성도 했고 생성자도 호출한다. => 복사본 사용
 JDialog jdg = new JDialog();
 JButton jbtn = new JButton("입력");

 public Sub3() {
  initDisplay();
 }

 public Sub3(Main3 main3) { // 파라미터로 넘겨준달!
  System.out.println(main3);
  if (main3 == null)
   System.out.println("main3은 null입니다 객체생성안된상태임");
  // 나는 언제 호출되나요 => 메인화면이 열릴때
  // 나는 어디서 호출되나요 => main3 클래스에서
  // 나는 왜 호출되나요 => 입력, 주문, 회원가입 할 때
  this.main3 = main3;// 객체치환 15번 null이였다가
  initDisplay();
 }

 // 화면처리부
 public void initDisplay() {
  jbtn.addActionListener(this);
  jdg.add("South", jbtn);
  jdg.setTitle("sub3");
  jdg.setSize(300, 200);
  jdg.setVisible(true);

 }

 int insert() {// 1.입력성공 , 0:입력실패
  return 1;
 }

 // public static void main(String[] args) {
 // new Sub3(null);// public Sub3(Main3 main3) 이 부분의 파라미터가 null => sub3의
 // initDisplay 실행
 // }

 /***************************************************************************
  * 콜백메소드라고 부른다
  * 저장버튼이 클릭되었을때 JVM이 이를 감지하고 인터셉트(끼어들어서)
  * 메소드 호출해준다
  * 파라미터인 ActionEvent 객체를 통해 이벤트가 감지된 버튼을 구분할 수 있음
  * 이 객체는 파라미터에 있으므로 JVM으로부터 주입되는 객체이다
  **************************************************************************/
 @Override
 public void actionPerformed(ActionEvent e) {
  Object obj = e.getSource();
  // 반복문을 탈출할때는 break문으로
  // 조건문을 탈출할때는 return 사용 => 메소드 빠져나가는것
  if (obj == jbtn) { // object가 jbtn이랑 일치하면
   int result = insert();
   if (result == 1) {
    JOptionPane.showMessageDialog(jdg, "입력 성공하였슨디ㅏ");
    main3.refresh();
   } else if (result == 0) {
    JOptionPane.showMessageDialog(jdg, "입력 실패하였슨디ㅏ");
    return;// actionPerformed탈출
   }

  }
 }
}
