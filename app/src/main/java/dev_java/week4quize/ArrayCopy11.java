package dev_java.week4quize;

import java.util.Arrays;

public class ArrayCopy11 {
 public static void main(String[] args) {
  ArrayCopy1 arrayCopy1 = new ArrayCopy1();
  System.out.println(Arrays.toString(arrayCopy1.fruit2));//null
  System.out.println(Arrays.toString(arrayCopy1.fruit));
  arrayCopy1.fruit2=new String[]{"파인애플","복숭아"};//재정의 함 =>NullPointerException 나타나지 않음 
  System.out.println(arrayCopy1.fruit2[1]); //NullPointerException

 }
}
