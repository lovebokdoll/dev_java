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

  // total score

  void totalScore() {
    int Name_Score[] = new int[4];//새로운 배열 생성
    for (int i = 0; i < data.length; i++) {
      for (int j = 1; j < data[i].length; j++) {
        Name_Score[i] += Integer.parseInt(data[i][j]);
      }
      System.out.println(data[i][0] + Name_Score[i]);
    }
  }

  // average
  void average() {

  }

  // rank
  void rank() {

  }

  public static void main(String[] args) {
    TwoArrayQuize taq = new TwoArrayQuize();
    taq.javaTot();
    taq.totalScore();
    taq.average();
    taq.rank();
  }
}
