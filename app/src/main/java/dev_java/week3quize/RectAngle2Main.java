package dev_java.week3quize;

class RectAngle2 {

 void calculation(int width, int height) {
  int area = width * height;
  System.out.println("면적은 :" + area);
 }

 int calculation(int width, int height, int result) {
  result = width * height;
  return result;
 }
}
public class RectAngle2Main {
 public static void main(String[] args) {
  RectAngle2 rectAngle2 = new RectAngle2();
  rectAngle2.calculation(10, 20);
  System.out.println(rectAngle2.calculation(10, 20, 0));
 }
}

/*
 * 메소드 꺼낸다 - 사용자정의 메소드 구현
 * 리턴타입을 결정하자
 * void일때
 * 
 * int일때
 * 
 * 출력하기 - where?
 * 
 * 파라미터의 갯수를 결정할 수 있다
 * 또 파라미터의 타입도 선택할 수 있다.
 */