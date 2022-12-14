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
  System.out.println(id);
  System.out.println(memberVO.getMem_id());// 이렇게 해야 불러올 수 있음
  // 19번 20번 줄은 같음
  // mem_name의 경우 접근제한자를 public으로 했으므로 직접 초기화가 가능하다.
  // memberVO.mem_name = "토마토";
  // String name = memberVO.mem_name;// null
  // System.out.println(name);
  // System.out.println(memberVO.mem_name);
  memberVO.setMem_name("이순신");// setter 메소드를 호출하는것 만으로 초기화 되는것임
  System.out.println(memberVO.getMem_name());
  // 사용할 때 set먼저 출력할때 private이므로 get메소드로 !!
  memberVO.setMem_pw("123");
  // getter메소드를 호출하면 전변인 mem_pw에 저장된 값이 출력 됨
  // setter메소드를 호출하지 않으면 null이 출력될것임
  System.out.println(memberVO.getMem_pw());
 }
}
