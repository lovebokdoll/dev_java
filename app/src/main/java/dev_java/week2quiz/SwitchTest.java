package dev_java.week2quiz;

//Question 52 : switch문
public class SwitchTest {
 // enum 타입의 데이터를 선언할 때 enum 키워드 사용
 // enum 키워드 뒤에 열거타입의 이름 {여기안에 값을 나열해서 사용한다.}
 public enum Dogs {
  collie, harrier, shepherd
 };

 public static void main(String[] args) {
  Dogs mydog = Dogs.shepherd;// 질문
  String dog = "세퍼드";
  switch (dog) {// enum타입은 올 수 없음! =>my dog를 넣으면 에러
   case "진돗개":
    System.out.print("collie");
   default: // default는 if 문의 else와 같아서 마지막에 와야한다.
    System.out.print("retriever");
   case "세퍼드":
    System.out.print("harrier");
  }
 }
}
