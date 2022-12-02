package dev_java.ch01;

public class MemberVOmain {
 public static void main(String[] args) {
  MemberVO memberVO = new MemberVO();
  String 사용자가입력한아이디 = "tomato";
  System.out.println(사용자가입력한아이디);

  // MemverVO클래스에서 mem_id는 접근제한자를 private로 했으므로 외부에서 접근이 불가
  // 그래서 setter메소드를 제공하고 있다

  // private으로 선언된 변수는 클래스 외부에서 사용이 불가
  // 캡슐화
  // System.out.println(memberVO.mem_id);
  // MemberVO.mem_id="tomato";//private이라서 쓸 수없음
  memberVO.setMem_id("tomato");
  // System.out.println(MemberVO.mem_id);//이렇게 하면 안됨 private이라서 !!!
  String id = memberVO.getMem_id();

  System.out.println(memberVO.getMem_id());// 이렇게 해야 불러올 수 있음
 }
}
