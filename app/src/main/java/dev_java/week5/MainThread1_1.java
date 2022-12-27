package dev_java.week5;

/*		
 * main메소드 호출은 JVM에 의해 호출된다. 		
 * JVM은 main스레드를 생성하여 main메소드를 호출한 것이다.		
 * 따라서 프로그램을 실행할 때 main메소드가 실행되었다는 것은 main스레드가 		
 * 수행되는 것이다.		
 * 그리고 main안에서 사용자가 만든 새로운 스레드를 실행시켰다면 		
 * 두 개의 스레드(main 스레드와 사용자 스레드)가 작동하고 있다는 것을 의미한다.		
 * 		
 * 아래 결과는 예측 불허(실행할 때마다 다를 수 있다.)		
 * 		
 */
public class MainThread1_1 {// 나는 스레드 클래스가 아님
  // 단 메인스레드는 갖고 있음
  // jvm동작순서 18-19-20(main start)
  public static void main(String[] args) {
    System.out.println("====================================");
    System.out.println("main start");
    // implements Runnable 일때 start호출하는법 21~26
    Runnable r = new MyRunnableOne();// 인터페이스 = 구현체클래스(override : run-추상메소드) => 다형성 선언부 생성부 다름!!!
    Thread myThread = new Thread(r);
    // 아래 문장 에러나는 이유?
    // 스레드가 아니여서 에러,static안에서는 this사용 불가
    // Thread myThread = new Thread(this);//여기서 this는? MainThread1_1 => 스레드가 아님
    myThread.start();
    // 나자신이 Thread일때 start호출하는법과 아닐때 호출하는 방법 28~29
   // Thread himThread = new MyRunnableTwo();
   // himThread.start();
    System.out.println("main end");
  }

}

// Thread 되는 방법 2가지
// 1.상속 2.implements
// 공통점 - 둘다 run()가질 수 있다 ,재정의 할수 있다. - 그 안에서 실행문 처리하면 안전
class MyRunnableTwo extends Thread {
  @Override
  public void run() {
    System.out.println("MyRunnableTwo 호츌");
  }
}

class MyRunnableOne implements Runnable {
  @Override
  public void run() {
    System.out.println("run메소드 호출 성공");
    first();
  }

  public void first() {
    System.out.println("first메소드 호출 성공");
    second();
  }

  public void second() {
    System.out.println("second메소드 호출 성공");
    System.out.println("====================================");
  }
}
/*
 * 클래스를 상속받으면 클래스간의 결합도가 높아진다 => 재사용성 떨어짐(오작동경험)
 * 인터페이스 중심 코딩을 전개하는 방법 -오버라이딩 중요
 */
