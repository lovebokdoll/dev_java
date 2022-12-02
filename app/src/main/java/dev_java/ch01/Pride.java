package dev_java.ch01;

public class Pride {
  static String carName = "2023년형 프라이드";
  String carColor = "흰색";
  int wheelNum = 4;

  public static void main(String[] args) {
    // 변수이름 앞에 static이 있으면 인스턴스화 없이도 호출이 가능함.
    // 이 말은 같은 객체를 복제하지 않는다는 의미 포함
    System.out.println(carName);
    // 인스턴스화 라고 함 - Pride객체가 메모리 상주 -> 호출이 가능한 상태
    Pride myCar = new Pride();// myCar를 인스턴스 변수라 한다.
    // insert here
    System.out.println(myCar.carColor);
    // myCar.carColor = "보라색";
    myCar = null;// 주소번지가 가리키는 객체가 사라짐.타입은 남음
    myCar = new Pride();// 새로운 번지주소를 가짐.

    System.out.println(myCar.carColor);
    System.out.println("28번 라인에서 ====>" + myCar);
    System.out.println(myCar == myCar);// 무엇을 비교하는 문장인가?

  }
}
