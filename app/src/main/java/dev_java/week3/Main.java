package dev_java.week3;

public class Main {
 int i = 1;// 전역변수 i
 boolean isOK[] = new boolean[3];

 // 클래스급 false,false,false => 얘를 서브에서 사용할것임
 // =>인스턴스화
 public static void main(String[] args) {
  Sub sub = new Sub();// main class 에서 sub class 사용할때 인스턴스화 메인에서 서브를 필요로함
  // =>지역변수의 성격!!!!!!!!!!
  // new Sub(); 생성자 호출 => 파라미터가 하나도 없는 생성자 :디폴트 생성자
  System.out.println(sub.j);// j라는것 = .연산자 앞에 소유주가 오는것은 전역변수
  // 전역변수만이 인스턴스변수.변수명 으로 호출 할 수 있다

 }
}
