package dev_java.ch03;

/*
 *다음은 중간고사 채점 결과표이다.
 *String[][] data ={
 * {"이순신","80","75","70"}
 * {"강감찬","90","85","95"}
 * {"김춘추","65","60","60"}
 *}
 *학생별 총점,평균 ,석차를 구하는 프로그램을 작성하시오.
 */
public class TwoArrayQuize {
 String[] subject = { "JAVA", "ORACLE", "SPRING" };
 String[][] data = {
   { "이순신", "80", "75", "70" },
   { "강감찬", "90", "85", "95" },
   { "김춘추", "65", "60", "60" }
 };

 // 자바 점수의 합?
 void javaTot() {
  int javaHap = 0;
  for (int i = 0; i < data.length; i++) {
   javaHap += Integer.parseInt(data[i][1]);
  }
  System.out.println("java 총점은?" + javaHap);
 }

 void namePrint() {
  System.out.println("===학생이름===");
  for (int i = 0; i < data.length; i++) {
   System.out.print(data[i][0]);
  }
 }

 // total score
 /*
  * void totalScore() {
  * System.out.println("===학생별 총점===");
  * int sum = 0;
  * for (int i = 0; i < data.length; i++) {
  * sum = sum + Integer.parseInt(data[1][i]);
  * }
  * System.out.println(sum);
  * }
  */

 // average
 void average() {

 }

 // rank
 void rank() {

 }

 public static void main(String[] args) {
  TwoArrayQuize taq = new TwoArrayQuize();
  taq.javaTot();
  taq.namePrint();
  // taq.totalScore();
  taq.average();
  taq.rank();

 }

}
