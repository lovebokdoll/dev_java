
package dev_java.week5;

class StopThread implements Runnable {							
	boolean stopped = false;						
							
							
	@Override						
	public void run() {						
		while(!stopped) {//true
			System.out.println("Thread is alive....");//출력
			try {				
				Thread.sleep(500);//0.5초 후에 또 출력 			
			} catch (InterruptedException e) {				
				e.printStackTrace();			
			}				
		}
    //아래코드는 9번과 16번 구간중 13번 에서 멈춰있을때 다른스레드가 인터셉트 가능함 -다른스레드가 있으면				
		System.out.println("Thread is deaded");					
	}						
	public void stop() {						
		stopped = true;					
	}						
}							


public class StopThreadTest {							
	public static void main(String[] args) {						
		StopThreadTest stt = new StopThreadTest();					
		stt.process();					
	}						
	public void process() {						
		StopThread st = new StopThread();					
		Thread th = new Thread(st);					
		th.start();					
		try {					
			Thread.sleep(1000);				
		} catch (InterruptedException e) {					
			e.printStackTrace();				
		}					
		st.stop();					
	}						
}							
