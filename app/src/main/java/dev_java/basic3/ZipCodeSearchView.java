package dev_java.basic3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import dev_java.util.DBConnectionMgr;

public class ZipCodeSearchView extends JFrame implements ItemListener {
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
  JPanel jp_north = new JPanel();
  JComboBox jcb_zdo = null;
  JComboBox jcb_sigu = null;
  JComboBox jcb_dong = null;
  DBConnectionMgr dbMgr = new DBConnectionMgr();
  Connection con = null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;

  // 생성자

  public ZipCodeSearchView() {
    zdos = getZDOList();// db를 거쳐야 하기때문에 게으른 인스턴스화
    jcb_zdo = new JComboBox(zdos);
    jcb_zdo.addItemListener(this);
    jcb_sigu = new JComboBox(totals);
    jcb_sigu.addItemListener(this);
    jcb_dong = new JComboBox(totals);
    jcb_dong.addItemListener(this);
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

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jp_north.add(jcb_zdo);
    jp_north.add(jcb_sigu);
    jp_north.add(jcb_dong);
    this.add("North", jp_north);
    this.setSize(630, 400);
    this.setVisible(true);
  }

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
}
