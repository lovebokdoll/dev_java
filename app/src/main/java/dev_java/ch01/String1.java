package dev_java.ch01;

public class String1 {
 public static void main(String[] args) {
  String s1 = "안녕";
  String s2 = "안녕";
  // 주소번지가 가리키는 값을 비교하려면 equals라는 메소드를 찾아볼것.
  String s3 = new String("안녕");
  String s4 = new String("안녕");
  // new연산자를 쓰면 메모리 영역에서 heap 영역에 객체가 생김
  //

  /*
   * insert here
   * s1과 s2의 주소번지는 같니? 참 거짓 그리고 이유
   * s3과 s4의 주소번지는 같니?
   * 만일 s3이 가리키는 문자열이 s4와 같은지 비교하려면? 구글링해서 확인해보기
   */

  System.out.println(s3 == s4);// false
  /*
   * new연산자를 이용해 새로운 객체를 만듦 => 같은 값을 가지더라고 독립된 객체생성
   */
  System.out.println(s1 == s2); // true
  /*
   * 리터럴이 같은 경우 jvm이 같은 값을 가지는 주소를 훑음
   * 그리고 같은 값을 가진 경우 같은 주소를 참조함~~
   */

 }
}
