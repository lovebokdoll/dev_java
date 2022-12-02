package dev_java.ch01;

public class DeptVOMain {

  public static void main(String[] args) {
    DeptVO deptVO = new DeptVO();// 인스턴스화 ->HEAP에 상주
    // 먼저 선언하고 먼저 초기화해야 출력값에 반영이 됨!!
    deptVO.deptno = 10;
    deptVO.dname = "개발1팀";
    System.out.println(deptVO.deptno);// 10
    System.out.println(deptVO.dname);// "개발1팀"
    deptVO = new DeptVO();
    // 앞에 타입이 빠졌으므로 객체생성,변수 선언이 아니라 객체 생성=>사용
    /*
     * [deptVO = new DeptVO();]은 [6번줄의 DeptVO deptVO = new DeptVO();]와
     * 타입은 같지만 다른 객체이다.
     */
    deptVO.deptno = 30;
    // deptVO.dname = "개발2팀";
    System.out.println(deptVO.deptno);// 30
    System.out.println(deptVO.dname);// "개발2팀"
    System.out.println(deptVO.loc);// null
  }
}
