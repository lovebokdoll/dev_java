package dev_java.ch03;

public class TwoArray1 {
 void toWhile(int[][] arr) {
  int i = 0;
  while (i < arr.length) {
   int j = 0;
   while (j < arr[i].length) {
    System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
    j++;
   }
   i++;
  }
 }

 public static void main(String[] args) {
  int arr[][] = new int[2][3];//2차 객체배열
  for (int i = 0; i < arr.length; i++) {// row
   for (int j = 0; j < arr[i].length; j++) {// colum
    System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
   }
  }
  TwoArray1 ta1 = new TwoArray1();
  ta1.toWhile(arr);
 }
}
