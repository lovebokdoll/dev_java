package dev_java.ch01;

import java.util.Scanner;

/*
java.lang 패키지 외 클래스들은 모두 import문을 추가해야한다.
-> 하지 않으면 컴파일 에러 -> .class생성안됨
*/
/*
 클래스의 구성요소 2가지 : 명사(필드 변수)/동사(매소드)
 클래스 인스턴스화 하면 = ?
 인스턴스화.메소드명()
 인스턴스화.메소드명(int i)
 인스턴스화.메소드명(int i,double d,...)
 인스턴스화.전역변수(원시형+참조형 모두...)
*/

public class Staticexam6 {
 public static void main(String[] args) {
  // 생성자이든 메소드이든 파라미터의 갯수 혹은 타입은 반드시 지켜야 한다
  Scanner scanner = new Scanner(System.in);// in은 입력장치를 으ㅣ미함(키보드,마우스..) 받아오는것 출력 XXXXXX
  scanner.close();
  System.out.println("0  부터 9    사이의 숫자를 입력하세요.");
  String user = scanner.nextLine();
  System.out.println("사용자가 입력한 숫자는 " + user + "입니다.");
  System.out.println(user + 1);
 }
}
