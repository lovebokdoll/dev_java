package dev_java.tables;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.FlowLayout;

//이른인스턴스화,게으른인스턴스화
//어떤 클래스를 상속 받을 때에는 extends예약어를 사용
// A is a B 관계이면 상속으로 처리한다.
//소나타는 자동차이다.(0)
//자동차는 소나타이다.(x)
//부모클래스가 가진 변수와 메소드도 사용가능함 => 자손이 더 많이 누릴 수 있다.

public class DeptTable1 extends JFrame { // DeptTable1 is a JFrame
 // 선언부
 String header[] = { "부서번호", "부서명", "지역" };
 String datas[][] = new String[1][3];
 // DefaultTableModel dtm_dept =new DefaultTableModel(this,header);this가 들어가면 안되는
 // 이유
 // this는 사용된 클래스 영역에서 선언된 클래스를 가리킨다
 // 그러면 여기서는 DeptTable1타입인것임
 // 그런데 DefaultTableModel은 자바에서 제공되는 클래스임 => 생성자도 정해져 있음
 // 생성자는 메소드 오버로딩 규칙을 따름 => 파라미터의 갯수나 타입이 달라야함
 // 제공되는 생성자에 없음 => 결국 사용 못함 ====> 컴파일 에러(문법에러발생)
 // 파라미터에 무엇이 오는지 API보면 확인 할 수 있음
 DefaultTableModel dtm_dept = new DefaultTableModel(datas, header);// 생성자 호출
 JTable jtb_dept = new JTable(dtm_dept);
 JScrollPane jsp_dept = new JScrollPane(jtb_dept, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
   JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
 // 버튼 사용하려면 버튼 붙일패널 선언
 JPanel jp_north = new JPanel();
 JButton jbtn_sel = new JButton("조회");
 JButton jbtn_ins = new JButton("입력");
 JButton jbtn_upd = new JButton("수정");
 JButton jbtn_del = new JButton("삭제");

 // 생성자
 public DeptTable1() {
  initDisplay();
 }

 // 화면그리기
 public void initDisplay() {
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  jp_north.setLayout(new FlowLayout(FlowLayout.RIGHT));
  jp_north.add(jbtn_sel);
  jp_north.add(jbtn_ins);
  jp_north.add(jbtn_upd);
  jp_north.add(jbtn_del);
  this.add("North", jp_north);
  this.add("Center", jsp_dept);
  this.setTitle("부서관리 시스템 Ver1.0");
  this.setSize(500, 400);
  this.setVisible(true);

 }

 // 메인메소드
 public static void main(String[] args) {
  new DeptTable1();
 }
}
