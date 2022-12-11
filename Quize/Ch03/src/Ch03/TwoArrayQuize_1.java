package Ch03;

public class TwoArrayQuize_1 {
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
	 
	 void namePrint_0() {
	 System.out.print(data[0][0]+":");//이순신이름 출력
	 int nameHap = 0;
	  for (int i = 0; i < data.length; i++) {
		  nameHap += Integer.parseInt(data[0][i+1]);
	  }
	  System.out.println(nameHap);
	 }

	 void namePrint_1() {
		 System.out.print(data[1][0]+":");//강감이름 출력
		 int nameHap = 0;
		  for (int i = 0; i < data.length; i++) {
			  nameHap += Integer.parseInt(data[1][i+1]);
		  }
		  System.out.println(nameHap);
		 }

	 void namePrint_2() {
		 System.out.print(data[2][0]+":");//김춘추이름 출력
		 int nameHap = 0;
		  for (int i = 0; i < data.length; i++) {
			  nameHap += Integer.parseInt(data[2][i+1]);
		  }
		  System.out.println(nameHap);
		 }


	
	 // average
	 void average_0() {
		 System.out.print(data[0][0]+":");//이순신이름 출력
		 int nameHap = 0;
		  for (int i = 0; i < data.length; i++) {
			  nameHap += Integer.parseInt(data[0][i+1]);
		  }
		  System.out.println(nameHap/3);
	 }
	 void average_1() {
		 System.out.print(data[1][0]+":");//강감이름 출력
		 int nameHap = 0;
		  for (int i = 0; i < data.length; i++) {
			  nameHap += Integer.parseInt(data[1][i+1]);
		  }
		  System.out.println(nameHap/3);
		 }

	 void average_2() {
		 System.out.print(data[2][0]+":");//김춘추이름 출력
		 int nameHap = 0;
		  for (int i = 0; i < data.length; i++) {
			  nameHap += Integer.parseInt(data[2][i+1]);
		  }
		  System.out.println(nameHap/3);
		 }

	 

	 // rank
	 void rank() {

	 }

	 public static void main(String[] args) {
		 TwoArrayQuize_1 taq = new TwoArrayQuize_1();
	  taq.javaTot();
	  System.out.println("===학생별총점 ===");
	  taq.namePrint_0();
	  taq.namePrint_1();
	  taq.namePrint_2();
	  System.out.println("===학생별평균 ===");
	  taq.average_0();
	  taq.average_1();
	  taq.average_2();
	  taq.rank();

	 }
}
