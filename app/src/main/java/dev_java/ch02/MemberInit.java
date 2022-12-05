package dev_java.ch02;

public class MemberInit {
 int i;
 int hap;

 // 디폴트 생성자라고 부름-디폴트 생성자는 파라미터를 결정해 줄 필요 없음
 // JVM이 대신 생성해주어 전변들을 초기화시킴
 public MemberInit() {
  System.out.println("디폴트 생성자 호출 성공" + i + "," + hap);// 0 0
 }

 public MemberInit(int i, int hap) {
  this.i = i;
  this.hap = hap;
  System.out.println("파라미터가 두개인 생성자호출 성공" + this.i + "," + this.hap);// 1 0
 }
 /*
  * public MemberInit(int v, int sum) { //중복선언 하려면 :파라미터의 개수다름/ 타입이 다름
  * System.out.println("파라미터가 두개인 생성자호출 성공");
  * this.i = i;
  * this.hap = hap;
  * }
  */

 public static void main(String[] args) {
  MemberInit mi = new MemberInit();// 9번생성자 호출 -메소드오버로딩 메커니즘
  MemberInit mi2 = new MemberInit(1, 0);// 13번생성자 호출
 }

}