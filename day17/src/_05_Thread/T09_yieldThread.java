package _05_Thread;

class ThreadA extends Thread {
	
	boolean stop = false; // 쓰레드 종료
	boolean work = true; // yield 메소드를 호출한 싲머을 알기 위해
	
	@Override
	public void run() {
		while(!stop) { // !stop = true 
			if(work) { // work = true , work가 트루라면 실행
				System.out.println("ThreadA 작업 중");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThradA 쓰레드 종료");
	}
}

class ThreadB extends Thread {
	
	boolean stop = false; // 쓰레드 종료
	boolean work = true; // yield 메소드를 호출한 싲머을 알기 위해
	
	@Override
	public void run() {
		while(!stop) { // !stop = true 
			if(work) { // work = true , work가 트루라면 실행
				System.out.println("ThreadB 작업 중");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThradB 쓰레드 종료");
	}
}


public class T09_yieldThread {

	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		ta.start();
		tb.start();
		
		// a, b  3초동안은 번갈아 가면서 실행 (3000 = 3초 , 1000 = 1초 , 500 = 0.5초)
		
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("------------ 0.05초 끝");
		ta.work = false; // 0.05초 후에는 b작업 하라는 소리
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-------------  0.1초 끝");
		ta.stop = true; // 번갈아 가면서
		
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ta.stop = true;
		tb.stop = true;
		
		
		
	}

}
