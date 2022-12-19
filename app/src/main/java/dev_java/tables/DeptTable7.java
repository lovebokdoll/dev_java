package dev_java.tables;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class DeptTable7 extends JFrame implements ActionListener {
  // 선언부
  // 파라미터의 this는 DeptTable7타입이고 main에서 호출된 생성자로 현재 메모리에 로딩중인 그 객체를 가리킨다.
  // 왜 this를 넘겨야 하나요?
  // :JTable7Dialog에서 부서번호 부서명 지역을 입력한 후 저장버튼을 누르면 Vector<String[]> 추가하고 추가된 로우를
  // 포함하는
  // :Vector가 부모창에 새로 리플래쉬(재사용- 부모 클래스에 구현함..) 되어야 하니까 호출해야한다.
  JTable7Dialog jtd7 = new JTable7Dialog(this);
  String header[] = { "부서번호", "부서명", "지역" };
  String datas[][] = new String[0][3];

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
  JButton jbtn_det = new JButton("상세보기");
  static Vector<String[]> vdata = new Vector<>(); // vdata.size=0;

  // 생성자
  public DeptTable7() {
    initDisplay();
  }

  // 화면그리기
  public void initDisplay() {
    jbtn_ins.addActionListener(this);
    jbtn_upd.addActionListener(this);
    jbtn_det.addActionListener(this);
    jbtn_sel.addActionListener(this);
    jbtn_del.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jp_north.setLayout(new FlowLayout(FlowLayout.RIGHT));
    jp_north.add(jbtn_sel);
    jp_north.add(jbtn_ins);
    jp_north.add(jbtn_upd);
    jp_north.add(jbtn_del);
    jp_north.add(jbtn_det);
    this.add("North", jp_north);
    this.add("Center", jsp_dept);
    this.setTitle("부서관리 시스템 Ver1.0");
    this.setSize(500, 400);
    this.setVisible(true);

  }

  // 새로고침 -Vector에 담긴 String[]출력하기
  // 입력 수정화면에서 저장버튼 누르면 Vector에 String[]추가하고
  // 그 다이얼로그 화면은 닫히고 부모창은 새로고침 처리한다.
  // 그러니까 다이얼로그창에서 부모클래스의 refreshData메소드를 호출해야함
  // 그러니까 인스턴스화 할 때 파라미터에 this 넘겨서 사용할 수 있도록 할것
  public void refreshData() {
    System.out.println("refreshData 호출");
    // 입력,수정 전에 조회된 정보는 삭제함
    while (dtm_dept.getRowCount() > 0) {
      dtm_dept.removeRow(0);
    }
    if (DeptTable7.vdata.size() <= 0) {
      JOptionPane.showMessageDialog(this, "조회결과가 없습니다", "WARN", JOptionPane.INFORMATION_MESSAGE);
      return;// refreshData()탈출
    }

    // 벡터의 크기만큼 반복하면서 dtm_dept 데이터셋에 String[]추가함
    for (int i = 0; i < vdata.size(); i++) {
      String[] oneRow = vdata.get(i);
      dtm_dept.addRow(oneRow);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // 입력버튼 누른거야?
    Object obj = e.getSource();
    // 조회할거야?
    if (obj == jbtn_sel) {
      refreshData();
    } else if (obj == jbtn_ins) {

      jtd7.set("입력", true, null);

    }
    // 수정할라고?
    else if (obj == jbtn_upd) {
      // 어떤 로우를 수정 할거니?
      int index = jtb_dept.getSelectedRow(); // 선택된 로우의 인덱스값을 가져온다.
      // 데이터셋 객체로 백터를 사용중이니 백터에서 꺼낸 값을 String[]초기화
      // 테이블의 양식폼인 JTable 이벤트로 얻어롬
      String[] oneRow = vdata.get(index);
      jtd7.set("수정", true, oneRow);
    }
    // 상세보기 원해?
    else if (obj == jbtn_det) {

      // jtd7.set("상세보기",true,데이터로우값-String[]);
    }

  }

  public static void main(String[] args) {
    new DeptTable7();
  }
}
