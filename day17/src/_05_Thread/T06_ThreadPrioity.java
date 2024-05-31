package _05_Thread;

class PThread extends Thread {
	

	@Override
	public void run() {
		for(int i=0; i<500; i++	) {
			System.out.print("#");
			for(int j=0; j<10000000; j++);
		}
	}
}

class PThread2 extends Thread {
@Override
public void run() {
	for(int i=0; i<500; i++	) {
		System.out.print("|");
		for(int j=0; j<10000000; j++);
		}
	}
}

		
public class T06_ThreadPrioity {

	public static void main(String[] args) {
		PThread pt1 = new PThread();
		PThread2 pt2 = new PThread2();
		
		// pt2.setPriority(10); 밑에  Thread.MAX_PRIORITY 이말과 똑같은 출력값이 나옴
		pt2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("pt1의 우선순위 : " + pt1.getPriority());
		System.out.println("pt2의 우선순위 : " + pt2.getPriority());
		
		pt1.start();
		pt2.start();
		
		
		
	}

}
