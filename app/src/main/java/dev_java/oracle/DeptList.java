package dev_java.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;//커서를 조정하는 인터페이스
import java.util.ArrayList;
import java.util.List;

import dev_java.util.DBConnectionMgr;
import dev_java.week4.DeptVO;

//db연동으로 정보 꺼내기

public class DeptList {

  Connection con = null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  DBConnectionMgr dbMgr = new DBConnectionMgr();

  public List<DeptVO> getDeptList() {// 전체 조회하는 메소드
    con = dbMgr.getConnection();
    String sql = "SELECT deptno, dname, loc FROM dept";
    List<DeptVO> deptlist = new ArrayList<>();
    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();// 오라클 서버에게 처리를 요청함.

      DeptVO dVO = null;
      while (rs.next()) {// 정보가 있나요? boolean=true while문 실행
        // 리스트에 제네릭으로 담는다욜
        dVO = DeptVO.builder().deptno(rs.getInt("deptno")).dname(rs.getString("dname")).loc(rs.getString("loc"))
            .build();
        deptlist.add(dVO);
      }
    } catch (Exception e) {
      System.out.println(e.toString());
    }
    return deptlist;
  }

  public static void main(String[] args) {

    DeptList deptList = new DeptList();
    List<DeptVO> list = null;
    list = deptList.getDeptList();
    for (int i = 0; i < list.size(); i++) {
      DeptVO rdVO = list.get(i);
      System.out.println(rdVO.getDeptno() + "," + rdVO.getDname() + "," + rdVO.getLoc());
    }
  }
}
