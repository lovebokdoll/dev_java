package dev_java.kh_test;

public class Test3 {
 public static void main(String[] args) {
  int arr[] = new int[4]; // 0,0,0,0

  for (int i = 0; i <= arr.length; i++) {
   try {
    arr[i] += (10 + i);
    System.out.println(arr[i]);
   } catch (ArrayIndexOutOfBoundsException e) {
    System.out.println(e.toString());
   }
  }
  System.out.println("here");
 }
}
/*
 * 선언,생성만 한것 ,초기화는
 * 되지 않음 default 값은 0,0,0,0 length=4==>
 * 마지막은 n-1 인데 4
 * 가 포함이니까
 * 터짐
 */