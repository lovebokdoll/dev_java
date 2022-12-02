package dev_java.ch01;

//[class 는 메인메소드를 가지지 않아도 된다 단, 출력되지 않음]

public class MemberVO {
 private String mem_id = null;
 private String mem_pw = null;
 private String mem_name = null;

 // 회원정보를 관리하기위한 목적으로 설계하였다-그래서 메인메소드는 필요 없음
 // private 보안정보

 // setter 는 write,save
 // setter메소드를 활용하여 전역변수 mem_id를 초기화 한다.
 public void setMem_id(String mem_id) {
  this.mem_id = mem_id;// this = 나 자신(전역변수)일 때 붙일 수 있음
 }

 // getter 는 read,듣기
 public String getMem_id() {
  return mem_id;
 }

 public static void main(String[] args) {
  MemberVO memberVO = new MemberVO();

  System.out.println(memberVO.mem_id);// 초기화를 안했으니까 null출력
 }
}
