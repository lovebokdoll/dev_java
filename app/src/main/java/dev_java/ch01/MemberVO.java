package dev_java.ch01;

//[class 는 메인메소드를 가지지 않아도 된다 단, 출력되지 않음]

public class MemberVO {
 private String mem_id = null;
 private String mem_pw = null;
 private String mem_name = null;
 // 자료구조의 일부로 사용함
 // private 보안정보

 // setter 는 write,save
 public void setMem_id(String mem_id){
  this.mem_id=mem_id;
  
 //setter 는 read,듣기
 public String getMem_id() {
  return mem_id;
 }
}
