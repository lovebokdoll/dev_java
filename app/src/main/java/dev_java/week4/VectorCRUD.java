package dev_java.week4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
//list -순서,느리다,정렬,추가하면 맨 뒤에 채운다
//index가 다르면 중복값 저장가능
import javax.swing.JOptionPane;

import dev_java.ch02.Array;

public class VectorCRUD {
 static Vector<String[]> vdept = new Vector<>();
 static Vector<DeptVO> vdept2 = new Vector<>();

 public void getDeptList() {
  for (int i = 0; i < vdept.size(); i++) {
   String[] oneRow = vdept.get(i);
   for (int j = 0; j < oneRow.length; j++) {
    System.out.println(oneRow[j] + ",");
   }
   System.out.println();
  }
 }

 // 벡터에 부서정보 추가하기 => 없는것을 새로 추가
 // pass by value로 호출하는 경우 주소번지 받아옴 => 원본을 받는것 main.ival,sub.ival
 public int deptInsert(String[] userDept) {
  System.out.println("부서 정보 입력 호출");
  int result = 0; // 1이면 성공 0이면 실패
  boolean isOK = vdept.add(userDept);
  if (isOK)
   result = 1;
  return result;
 }

 // 벡터에 부서정보 수정하기 => 있는것 변경
 public int deptUpdate(int user, String user_dname, String user_loc) {
  System.out.println("부서 정보 입력 변경");
  int result = 0; // 1이면 성공 0이면 실패

  return result;
 }

 // 벡터에 부서정보 삭제하기 => 있는것 삭제
 // 벡터에 있는 부서정보 중에서 어떤 로우를 삭제 할 건지 부서번호 받아와야 함
 // 이것은 사용자로부터 받아와야 하는 값임
 // => 그런데 String[]에서 부서번호는 String타입..=> 형전환 필요
 public int deptDelete(int deptno) {
  System.out.println("부서 정보 입력 호출");
  int result = 0; // 1이면 성공 0이면 실패
  for (int i = 0; i < vdept.size(); i++) {
   String oneRow[] = vdept.get(i);
   int deptno2 = 0;
   // 예외 발생에 대한 우려 방어코드 작성
   if (oneRow[0] != null) {// null 체크
    deptno2 = Integer.parseInt(oneRow[0]);
   }
   // 사용자가 선택한 부서번호와 벡터에 있는 부서번호 비교하여 같은것 찾기
   if (deptno == deptno2) {
    // 삭제할 백터의 로우값필요 -> 벡터의 size통해 찾아냄
    // 여기서는 변수 i가 인덱스 값에 해당됨
    // remove메소드의 파라미터가 int인 경우에 대해서만 삭제된 객체 백터의 제네릭
    // 반황해줌. 그것을 받아서 처리여부확인가능함
    String[] deleteRow = vdept.remove(i);
    System.out.println("삭제된 배열은" + Arrays.toString(deleteRow));
    // boolean isOK = vdept.remove(oneRow);// 메소드오버로딩이라고 한다
    if (deleteRow != null) {
     System.out.println("삭제 처리되었습니다");
     // JOptionPane.showMessageDialog(null, "삭제 처리 되었습니다");
     result = 1;
    }
   }
  }
  return result;
 }

 // 벡터에 부서정보 상세보기 => 있는것 꺼내봄
 public String[] deptDetail(int index) {
  String[] oneRow = new String[3];
  for (int i = 0; i < vdept.size(); i++)
   if (1 == 1) {

   }
  return oneRow;
 }

 public static void main(String[] args) {
  VectorCRUD vCrud = new VectorCRUD();
  // 입력테스트
  int deptno = 10;
  String dname = "개발부";
  String loc = "서울";
  String[] oneRow = { "10", "개발부", "서울" }; // 제네릭타입으로사용
  int result1 = vCrud.deptInsert(oneRow);
  String[] oneRow2 = { "20", "총무부", "대전" };
  result1 = vCrud.deptInsert(oneRow2);
  if (result1 == 1) {
   JOptionPane.showMessageDialog(null, "등록이 되었습니다.");
   vCrud.getDeptList();
   // return;
  }
  Scanner s = new Scanner(System.in);
  System.out.print("삭제할 부서번호를 입력하세요");
  int user = s.nextInt();

  // 수정테스트
  // vdept.set(2, "대전");
  // int result2 = vCrud.deptUpdate(oneRow);
  // System.out.println(result2);

  // 삭제테스트
  int result3 = vCrud.deptDelete(user);
  if (result3 == 1) {
   JOptionPane.showMessageDialog(null, "삭제가 되었습니다.");
   vCrud.getDeptList();
   // return;
  }
  s.close();
  // 상세보기테스트
  String[] result4 = vCrud.deptDetail(deptno);
 }
}
