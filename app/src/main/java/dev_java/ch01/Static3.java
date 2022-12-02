package dev_java.ch01;

class Static3{
 int i;
 static int j;
 void methodX(){
    System.out.println("non-static   변수 i  methodA     에서 호출가능 ===> "+i);
    System.out.println("non-static methodA()    호출 ===> "+j);
 }
 static void methodX(){
    //System.out.println("non-static   변수 i  methodB       에서 호출 불가 ===> "+i);
    System.out.println("static methodB()   호출 ===> "+j);
 }
public class Static3Main {
 public static void main(String[] args) {
    Static3 static3 = new Static3();
    static3.methodA();
    Static3.methodB();
 }
}
}
