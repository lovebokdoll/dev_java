package dev_java.week2quiz;

public class IntArray3 {
 void methodA(int ages[]){
    for(int i=0;i<3;i++){//for(초기값;조건;증감){}
       System.out.println(ages[i]);
    }
 }
 void methodB(int ages[]){//개선된 for문 for(변수명 : 배열명){}
    for(int i:ages){
       System.out.println(i);
    }
 }
 public static void main(String[] args) {
    // 한번에 세 사람의 나이를 담으려면?
    int ages[] = new int[3];//배열의 선언과 생성
    ages[0] = 1;//배열의 초기화
    ages[1] = 2;
    ages[2] = 3;
    IntArray3 ia = new IntArray3();
    System.out.println("=======[[ methodA 출력 - 고전 for문 ]]=======");
    ia.methodA(ages);
    System.out.println("=======[[ methodB 출력 - 개선된 for문 ]]=======");
    ia.methodB(ages);
    // 한 번에 세가지의 부서번호를 담으려면?
    int deptnos[] = { 10, 20, 30 };
    System.out.println(deptnos[0]);
    System.out.println(deptnos[1]);
    System.out.println(deptnos[2]);
 }
}
