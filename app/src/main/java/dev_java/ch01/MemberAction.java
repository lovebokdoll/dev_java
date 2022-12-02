package dev_java.ch01;

public class MemberAction {
 // 회원가입 성공하면 1로 반환, 실패하면 0으로 반환
 // 회원가입을 처리하는 메소드 선언하기
 public int memberinsert(String mem_id, String mem_pw, String mem_name) {
  System.out.println("memberinsert 호출-파라미터 3개");
  System.out.println(mem_id + "," + mem_pw + "," + mem_name);// 입력받을 값이 너무 많으면 이런식으로 하는게 힘듦
  int result = -1;
  // 회원가입에 성공했니?- 조건문을 사용해서 표현
  if (1 == 1) {
   result = 1;
  } else {
   result = 0;
  }
  return result;
 }

 public int memberinsert(MemberVO memberVO) {
  System.out.println("memberinsert 호출-파라미터 1개");
  System.out.println(memberVO.getMem_id() +
    "," + memberVO.getMem_pw() +
    "," + memberVO.getMem_name());// private이니까 get사용
  int result = -1;// End of file = 프로그램에서는 찾았을 때 없는 경우를 의미
  result = 1;
  return result;
 }

 public static void main(String[] args) {
  // insert here = memberinsert메소드 호출하시오.
  MemberAction memberAction = new MemberAction();
  int result = memberAction.memberinsert("다희", "123", "정다희");
  if (result == 1) {
   System.out.println("회원가입 성공하였습니다.");

  } else {
   System.out.println("회원가입 실패하였습니다.");
  }
  MemberVO memberVo = new MemberVO();
  memberVO.setMem_id("다희");
  memberVO.setMem_pw("123");
  memberVO.setMem_name("정다희");
  int result2 = memberAction.memberinsert(memberVo);
  if (result == 2) {
   System.out.println("회원가입 성공하였습니다.");

  } else {
   System.out.println("회원가입 실패하였습니다.");
  }

  memberVO.getMem_id("다희");
  memberVO.getMem_pw("123");
  memberVO.getMem_name("정다희");

 }
}
