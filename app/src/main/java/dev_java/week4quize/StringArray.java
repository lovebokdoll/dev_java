package dev_java.week4quize;

public class StringArray {

 public void array() {
  String[] aArry = { "빨강", "노랑", "파랑" };
  for (int i = 0; i < aArry.length; i++) {
   System.out.println(aArry[i]);
  }
  for (String str : aArry) {
   System.out.println(str);
  }
 }

 public static void main(String[] args) {
  StringArray sArray = new StringArray();
  sArray.array();
 }
}
