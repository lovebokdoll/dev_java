package dev_java.week3quize;

//접근제한자 privite(나만 사용) > friendly(같은 패키지 안에 있는것은 사용가능) > 
//          protected(상속관계에 있는 것은 사용가능)>public
//static : 변수 앞 , 메소드 앞 , 클래스 앞 가능
//final : 변수 앞에 상수 => 메소드 앞에 (오버라이딩 불가) => 클래스 앞에(상속 불가-자손 못가짐)
import java.util.Scanner;

public class Area {
 public static void main(String[] args) {
  int r1, r2 = 0; // 반지름 2개 담을 변수 선언
  double area = 0.0;
  final double PI = 3.14;
  // new 다음에 오는 클래스가 생성됨 => 이때 생성자 호출됨(메소드처럼)
  Scanner sc = new Scanner(System.in);// 인스턴스화 => 메모리에 로딩이 된다.
  System.out.print("첫번째 반지름을 입력하세요 : ");
  String user1 = sc.nextLine();// 메소드의 리턴타입은 String
  System.out.println("사용자가 입력한 첫번째 반지름은 :" + user1);
  System.out.print("두번째 반지름을 입력하세요");
  String user2 = sc.nextLine();
  System.out.println("사용자가 입력한 첫번째 반지름은 :" + user2);
  int i1 = Integer.parseInt(user1);// 첫번째 반지름을 원시형 int로 저장함 => 곱해야 하니까
  int i2 = Integer.parseInt(user1);// 두번째 반지름을 원시형 int로 저장함 => 곱해야 하니까
  area = i1 * i2 * PI; // int*int*double = double
  System.out.println("타원형의 면적은" + area + "입니다");
 }
}
