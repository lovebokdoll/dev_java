package dev_java.week3quize;

/*연습문제 4
두숫자를 입력 받아 둘 사이의 3의 배수 갯수를 카운트 하는 프로그램을 작성하시오.
예) 3, 13 두 숫자를 입력하였다면 3개 출력해 줌*/
public class Quiza4 {
 int cnt;// 0->1->2

 int account(int start, int end) {// start = 3,end = 13
  // for (int i = start; i <= end; i = i++)// if문 추가해서 3의배수 출력해보기
  for (int i = start; i <= end; i = i + 3) { // 3 6
   cnt++;
  }
  return cnt;
 }

 public static void main(String[] args) {
  Quiza4 quiza4 = new Quiza4();
  quiza4.account(3, 7);
  System.out.println(quiza4.cnt);
 }
}
