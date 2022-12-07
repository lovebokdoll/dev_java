package dev_java.ch02;

public class Switch1 {
 public static void main(String[] args) {
  String bread = "donut";
  switch (bread) { //입력변수
   case "소보로": { //case 입력값1
    int protocol = 100;
    System.out.println("소보로 빵 맛있다." + protocol);
    break; //case문을 실행한 뒤 switch문을 빠져나가기 위한것 , break문이 빠져있으면 그 다음 case 실행
   }
   case "donut": {
    int protocol = 200;
    System.out.printf("%s빵 맛있다.%d%n" + bread, protocol);
    break;
   }
   default:
    System.out.println("원하는 빵이 없습니다");
    break;
  }// end of switch
 }
}
