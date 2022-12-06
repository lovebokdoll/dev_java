package dev_java.ch02;

public class DoWhile {
 public static void main(String[] args) {

  int i = 1;
  // 조건 만족하지 않으면 한번도 실행안됨
  while (i > 3) {// while문에서 따져지는 조건은 1>3??==>false (-> 조건을 먼저 따진다)
   System.out.println("while실행문 출력됨");
  }
  System.out.println("요기");

  i = 1; // 굳이 i값을 1로 초기화 하는것을 동일한 조건에서 테스트하기 위함임!
  do {// 무조건 한번에 실행된다(-> 조건을 나중에 따진다)
   System.out.println("do_while실행문 출력됨");
  } while (i > 3);
 }
}
