package dev_java.week3quize;

class RectAngle3 {
 void area(int params[]) {
  
  params[2] = params[0] * params[1];
  System.out.println("면적은?" + params[2]);

 }
}

public class RectAngle3Main {

 public static void main(String[] args) {
  RectAngle3 rectAngle3 = new RectAngle3();
  int params[] = { 2, 3, 0 };
  rectAngle3.area(params);
 }
}

/*
 * 1-3
 * RectAngle3.class
 * 
 * RectAngle3Main.java
 * RectAngle3Main.class
 * 배열로 처리해 보기
 * 
 * 소스리뷰 -관전포인트 결정하기
 * 어느쪽이 직관적인가?
 * 어느쪽이 더 양이 많은가?,양만 많은가? 복잡도도 늘었나
 * 어느쪽이 재사용성이 좋은가?=> 결합도가 높은코드인가 아니면 낮은 코드인가
 * 1-1,1-2 vs 1-3
 * 
 * 
 */