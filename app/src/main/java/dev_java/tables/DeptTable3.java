package dev_java.tables;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class DeptTable3 extends JFrame implements ActionListener { // DeptTable1 is a JFrame
  // 선언부
  String header[] = { "부서번호", "부서명", "지역" };
  String datas[][] = new String[0][3];
  String[][] depts = {
      { "10", "개발부", "인천" },
      { "15", "총무부", "서울" },
      { "30", "생산부", "울산" }
  };

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
  public DeptTable3() {
    initDisplay();
  }

  // 화면그리기
  public void initDisplay() {
    jbtn_sel.addActionListener(this);
    jbtn_del.addActionListener(this);
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
    new DeptTable3();
  }

  @Override

  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (obj == jbtn_del) {
      int index = jtb_dept.getSelectedRow();
      System.out.println(index);
      Integer deptno = Integer.parseInt((String) dtm_dept.getValueAt(index, 0));
      System.out.println(deptno);
    } else if (obj == jbtn_sel) {
      for (int x = 0; x < depts.length; x++) {
        Vector<String> oneRow = new Vector<>();
        oneRow.add(depts[x][0]);
        oneRow.add(depts[x][1]);
        oneRow.add(depts[x][2]);
        dtm_dept.addRow(oneRow);
      }
      for (int i = 0; i < depts.length; i++) {
        for (int j = 0; j < depts[i].length; j++) {
          dtm_dept.setValueAt("여기", 1, 1);
          System.out.println(dtm_dept.getValueAt(i, j));

        }
        System.out.println();
      }
    } // end of 조회 이벤트 끝
  }
}
