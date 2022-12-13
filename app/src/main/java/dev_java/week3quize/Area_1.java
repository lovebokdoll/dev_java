package dev_java.week3quize;

//메인에서는 호출만 하는 방법
import java.util.Scanner;

public class Area_1 {
 // 메소드 리턴타입을 결정 할 수 있냐?
 // 메인메소드에서 출력 : double / 면적구하기메소드에서 출력 : void
 // 파라미터의 갯수와 타입까지도 선택할 수 있냐?
 double area;// 전역변수 => 초기화 생략가능 default 0.0
 final double PI = 3.14;

 double 면적구하기() {
  return 0.0;
 }

 double 면적구하기(int i1, int i2) {
  area = i1 * i2 * PI; // int*int*double = double
  return 0.0;
 }

 public static void main(String[] args) {
  Area_1 a1 = new Area_1();
  int r1, r2 = 0; // 반지름 2개 담을 변수 선언
  Scanner sc = new Scanner(System.in);// 인스턴스화 => 메모리에 로딩이 된다.
  System.out.print("첫번째 반지름을 입력하세요 : ");
  String user1 = sc.nextLine();// 메소드의 리턴타입은 String
  System.out.println("사용자가 입력한 첫번째 반지름은 :" + user1);
  System.out.print("두번째 반지름을 입력하세요");
  String user2 = sc.nextLine();
  System.out.println("사용자가 입력한 첫번째 반지름은 :" + user2);
  r1 = Integer.parseInt(user1);// 첫번째 반지름을 원시형 int로 저장함 => 곱해야 하니까
  r2 = Integer.parseInt(user2);// 두번째 반지름을 원시형 int로 저장함 => 곱해야 하니까
  a1.면적구하기(r1, r2);
  System.out.println("타원형의 면적은" + a1.area + "입니다");
  // System.out.println("타원형의 면적은" + Area_1.area + "입니다");
  // 이렇게 쓰려면 Static double area 여야함!!
 }
}
