package dev_java.ch01;

//[class 는 메인메소드를 가지지 않아도 된다 단, 출력되지 않음]
 // 회원정보를 관리하기위한 목적으로 설계하였다-그래서 메인메소드는 필요 없음
 // private 보안정보
public class MemberVO {
 private String mem_id = null;
 private String mem_pw = null;
 private String mem_name = null;

 public String getMem_id() {
  return this.mem_id;
 }
 // setter 는 write,save
 // setter메소드를 활용하여 전역변수 mem_id를 초기화 한다.
 public void setMem_id(String mem_id) {
  this.mem_id = mem_id;// this = 나 자신(전역변수)일 때 붙일 수 있음
 }
 // getter 는 read,듣기
 public String getMem_pw() {
  return this.mem_pw;
 }

 public void setMem_pw(String mem_pw) {
  this.mem_pw = mem_pw;
 }

 public String getMem_name() {
  return this.mem_name;
 }

 public void setMem_name(String mem_name) {
  this.mem_name = mem_name;
 }
}
