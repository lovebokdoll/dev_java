package dev_java.basic3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import dev_java.util.DBConnectionMgr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class ZipCodeSearchView extends JFrame implements ItemListener, FocusListener, ActionListener, MouseListener {
  // 선언부

  // 사용자가 선택한 zdo
  String zdo = null;
  // 사용자가 선택한 sigu
  String sigu = null;
  // 사용자가 선택한 dong
  String dong = null;
  // DB에서 가져온 zdo[]
  String[] zdos = null;
  // DB에서 가져온 sigu[]
  String[] sigus = null;
  // DB에서 가져온 dong[]
  String[] dongs = null;
  // 중분류(sigu)소분류(dong)
  String totals[] = { "전체" };
  // JPanel jp_north = new JPanel();//북쪽에 붙일 속지 - 콤보박스3개,JTextfield,JButton 디폴트
  // =>flowLayout
  JPanel jp_north = new JPanel(new FlowLayout(FlowLayout.LEFT)); // 중앙에서 좌우로 펼피면서 배치가 되는 컨셉
  JComboBox jcb_zdo = null;
  JComboBox jcb_sigu = null;
  JComboBox jcb_dong = null;

  //// <<<<<<<<<DB연동에 필요한 코드 시작>>>>>>>>>////
  // 물리적으로 떨어져있는 오라클 서버에 접속하는데 필요한 공통코드작성
  DBConnectionMgr dbMgr = new DBConnectionMgr();// Driverclass,커넥션정보
  Connection con = null;// 인터페이스
  PreparedStatement pstmt = null;// 인터페이스 - 동적쿼리처리
  ResultSet rs = null;// 오라클서버의 커서 조작하는 인터페이스 - next(),previous()
  //// <<<<<<<<<<<<<DB 연동 끝>>>>>>>>>>>>>////

  // 동이름을 입력받는 텍스트필드와 조회버튼 추가

  // CONCEPT
  // 생성자 파라미터자리를 이용하면 추가적인 메소드 호출 없이도 해당 화면에 대한
  // 추가적인 초기화 작업이 가능해서 코드의 양을 줄일 수 있음!!
  JTextField jtf_search = new JTextField("동이름을 입력하세요", 20);
  JButton jbtn_search = new JButton("조회");

  // 테이블생성
  String[] cols = { "우편번호", "주소" };
  String[][] data = new String[3][3];
  DefaultTableModel dtm_zipcode = new DefaultTableModel(data, cols);
  JTable jtb_zipcode = new JTable(dtm_zipcode);
  JTableHeader jth_zipcode = jtb_zipcode.getTableHeader();
  JScrollPane jsp_zipcode = new JScrollPane(jtb_zipcode, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  MemberShip memberShip = null;

  // 생성자
  public ZipCodeSearchView() {
    jbtn_search.addActionListener(this);
    jtf_search.addFocusListener(this);// this 이벤트처리 담당하는클래스가 나임~~

    zdos = getZDOList();// db를 거쳐야 하기때문에 게으른 인스턴스화
    jcb_zdo = new JComboBox(zdos);
    jcb_zdo.addItemListener(this);
    jcb_sigu = new JComboBox(totals);
    jcb_sigu.addItemListener(this);
    jcb_dong = new JComboBox(totals);
    jcb_dong.addItemListener(this);
  }

  public ZipCodeSearchView(MemberShip memberShip) {
    // this 뒤에 괄호가 있으면 자기자신의 디폴트 생성자 호출
    this();// 나자신의 디폴트 생성자 호출
    this.memberShip = memberShip;
    this.initDisplay();

  }

  // 대분류 정보 초기화에 필요한 DB조회하기 구현
  public String[] getZDOList() {// db를 거쳐야 하기때문에 게으른 인스턴스화
    StringBuilder sql = new StringBuilder();
    sql.append("SELECT '전체' ZDO FROM dual ");
    sql.append("UNION ALL ");
    sql.append("SELECT  ZDO ");
    sql.append(" FROM ( ");
    sql.append(" SELECT distinct(ZDO) ZDO ");
    sql.append(" FROM zipcode_t ");
    sql.append(" ORDER BY  ZDO ASC) ");
    try {
      // con의 주소번지가 확인되면 오라클 서버와 연결통로가 확보되었다.
      con = dbMgr.getConnection();
      pstmt = con.prepareStatement(sql.toString());
      // 오라클에서 생성된 테이블의 커서 디폴트 위치는 항상 is Top이다.
      rs = pstmt.executeQuery();
      Vector<String> v = new Vector<>();
      while (rs.next()) {
        String zdo = rs.getString("zdo");
        v.add(zdo);
      }
      zdos = new String[v.size()];
      v.copyInto(zdos);
    } catch (SQLException se) {
      System.out.println(se.toString());
      System.out.println(sql.toString());
    } catch (Exception e) {
      // TODO: handle exception
    } finally {
      try {
        dbMgr.freeConnection(con, pstmt, rs);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return zdos;
  }

  // 화면처리부
  public void initDisplay() {
    jtb_zipcode.addMouseListener(this);
    jth_zipcode.setBackground(Color.orange);
    jth_zipcode.setFont(new Font("맑은고딕", Font.BOLD, 20));
    jtb_zipcode.getColumnModel().getColumn(0).setPreferredWidth(100);
    jtb_zipcode.getColumnModel().getColumn(1).setPreferredWidth(500);
    jtb_zipcode.setGridColor(Color.gray);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jp_north.add(jcb_zdo);
    jp_north.add(jcb_sigu);
    jp_north.add(jcb_dong);
    jp_north.add(jtf_search);
    jp_north.add(jbtn_search);
    this.add("North", jp_north);
    this.add("Center", jsp_zipcode);
    this.setSize(630, 400);
    this.setVisible(false);
  }

  public void refreshDate(String zdo, String dong) {
    System.out.println("refreshDate호출성공");
    StringBuilder sql = new StringBuilder();
    sql.append("SELECT ");
    sql.append("          zipcode,address ");
    sql.append("FROM    zipcode_t ");
    sql.append("WHERE 1=1 ");
    if (zdo != null && zdo.length() > 0) {// 시,도 빈문자열이 아닌것도 필터링
      sql.append("AND zdo =? ");
    } // zdo가 존재할때만
    if (dong != null && dong.length() > 0) {// 덩 빈문자열이 아닌것도 필터링
      sql.append("AND dong LIKE ?||'%' ");

    } // dong이 입력받았을때만 => 선택적으로 들어와야함
    int i = 1;
    try {
      con = dbMgr.getConnection();// 오라클 서버와연결
      // 들어있는 타입과 형전환이 잘못선택되면 ClassCastingException이 발생가능
      pstmt = con.prepareStatement(sql.toString());// 들어있는 타입이 String이니까
      if (zdo != null && zdo.length() > 0) {
        pstmt.setString(i++, zdo);
      }
      if (dong != null && dong.length() > 0) {
        pstmt.setString(i++, dong);
      }
      // 입력수정삭제인 경우에는 executeUpdate()사용하고 리턴타입은 int
      // 조회인 경우에는 executeQuery()사용하고 리턴타입은 ResultSet
      // 테이블을 생성할 때는 execute()사용함
      rs = pstmt.executeQuery();
      List<Map<String, Object>> zipList = new ArrayList<>();
      Map<String, Object> rmap = null;
      while (rs.next()) {
        rmap = new HashMap<>();
        rmap.put("zipcode", rs.getString("zipcode"));
        rmap.put("address", rs.getString("address"));
        zipList.add(rmap);
      }
      // 컬렉션에서 제공하는 클래스는 주소번지 출력하더라도 그 구조안에 있는 값들이 출력됨 - toString()오버라이딩 되어있음
      System.out.println(zipList);
      // 화면처리하기 - 테이블 새로고침 처리하기
      // 조회결과가 있는건가용
      if (zipList.size() > 0) {
        // 조회를 연속하여 요청할 경우 기존에 조회된 화면은 지워주자
        while (dtm_zipcode.getRowCount() > 0) {
          // JTable은 양식일 뿐이고 실제 데이터는 DefaultTableModel에 있다.
          dtm_zipcode.removeRow(0);
        }
        // 새로 조회된 결과 출력하기
        for (int x = 0; x < zipList.size(); x++) {
          Map<String, Object> rmap2 = zipList.get(x);
          Vector<String> oneRow = new Vector<>();
          oneRow.add(0, rmap2.get("zipcode").toString());
          oneRow.add(1, rmap2.get("address").toString());
          dtm_zipcode.addRow(oneRow);
        }
      }

    } catch (SQLException se) {
      // TODO: handle exception
    } catch (Exception e) {

    } finally {
      dbMgr.freeConnection(con, pstmt, rs);
    }
  }// end of refreshData

  // 메인메소드
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    ZipCodeSearchView zcsv = new ZipCodeSearchView();
    zcsv.initDisplay();
  }

  @Override
  public void itemStateChanged(ItemEvent ie) {
    Object obj = ie.getSource();
    if (obj == jcb_zdo) {
      if (ie.getStateChange() == ItemEvent.SELECTED) {
        System.out.println(zdos[jcb_zdo.getSelectedIndex()]);
        zdo = zdos[jcb_zdo.getSelectedIndex()];
        sigus = getSiguList(zdo);
        // 대분류가 결정이 되었을 때 sigus를 초기화 해줘야 함
        // 기존에 디폴트로 전체 상수값을 넣어두었으니 이것을 삭제하고
        jcb_sigu.removeAllItems();
        // 새로운 DB서버에서 읽어온 값으로 아이템을 추가해야 한다 -초기화
        for (int i = 0; i < sigus.length; i++) {
          jcb_sigu.addItem(sigus[i]);
        }
      }
    }
  }

  public String[] getSiguList(String zdo) {
    StringBuilder sql = new StringBuilder();
    sql.append("SELECT '전체' SIGU FROM dual ");
    sql.append("UNION ALL ");
    sql.append("SELECT  SIGU ");
    sql.append(" FROM ( ");
    sql.append(" SELECT distinct(SIGU) SIGU ");
    sql.append(" FROM zipcode_t ");
    sql.append("  WHERE ZDO = ?");
    sql.append(" ORDER BY  SIGU ASC) ");
    try {
      // con의 주소번지가 확인되면 오라클 서버와 연결통로가 확보되었다.
      con = dbMgr.getConnection();
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setString(1, zdo);
      // 오라클에서 생성된 테이블의 커서 디폴트 위치는 항상 is Top이다.
      rs = pstmt.executeQuery();
      Vector<String> v = new Vector<>();// copyInto메소드 사용 위해 작성
      while (rs.next()) {
        String sigu = rs.getString("sigu");
        v.add(sigu);
      }
      // 시구콤보박스에 들어갈 배열생성하기
      sigus = new String[v.size()];
      // 배열에 들어있는 값 String배열에 복사하기
      v.copyInto(sigus);
    } catch (SQLException se) {
      System.out.println(se.toString());
      System.out.println(sql.toString());
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        dbMgr.freeConnection(con, pstmt, rs);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return sigus;
  }

  @Override
  public void focusGained(FocusEvent e) {
    if (e.getSource() == jtf_search) {
      jtf_search.setText("");
    }
  }

  // 아래 메소드는 구현할 필요가 없지만 지우면 에러가 발생한다
  // 추상메소드니까! 인터페이스를 implements하면 반드시 구현체 클래스가 되야 하므로
  // 인터페이스가 소지한 모든 추상메소드를 구현해야 한다
  @Override
  public void focusLost(FocusEvent e) {
    // {}로만 묶여있어도 구현으로 본다!!
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (jbtn_search == obj || jtf_search == obj) {
      String myDong = jtf_search.getText();
      refreshDate(zdo, myDong);
    }

  }

  @Override
  public void mouseClicked(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mousePressed(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseReleased(MouseEvent e) {
    if (e.getClickCount() == 2) {
      System.out.println("더블클릭 한거야?");
    }
    int index =jtb_zipcode.getSelectedRow();
    for(int i=0;i<dtm_zipcode.getRowCount();i++){
      if(jtb_zipcode.isRowSelected(i)){
        String address = dtm_zipcode.getValueAt(i, 1).toString();
        memberShip.jtf_zipcode.setText(String.valueOf(dtm_zipcode.getValueAt(i, 0)));
        memberShip.jtf_address.setText(address);
        this.dispose();
  }
}
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub

  }
}
