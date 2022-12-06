package dev_java.ch02;

public class NansuMaker {
 // 만일 여기서 채번한 값을 다른클래스에서 재사용해야 한다면 멤버변수로 결정
 int com[] = new int[3];
 int my[] = new int[3];// 사용자가 선택한 숫자
 // 난수발생하여 3자리의 서로 다른 숫자로된 값을 배열에 담기

 public void ranCom() {
  com[0] = (int) (Math.random() * 10);// 첫번째 숫자는 비교대상이 없음
  do {
   com[1] = (int) (Math.random() * 10);// 두번째 채번
  } while (com[0] == com[1]);
  do {
   com[2] = (int) (Math.random() * 10);// 세번째 채번
  } while (com[0] == com[2] || com[1] == com[2]);

 }

 // 초기화 , 전역변수로 할까 /지역변수로 할까?
 // 자리가 같다는 것을 배열의 index를 활용하시오.
 public String account(String uaer_input) {
  // insert here
  my[0] = 256 / 100;
  return "1strike 2ball";
 }

 public static void main(String[] args) {
  NansuMaker nansuMaker = new NansuMaker();
  for (int i = 0; i < 10; i++) {
   nansuMaker.ranCom();
   System.out.println(nansuMaker.com[0] + "" + nansuMaker.com[1] + "" + nansuMaker.com[2]);
  }
 }
}
