package _04_interface;

public class RemoteRun {

	public static void main(String[] args) {
		// interface는 객체 생성을 할수가 없다.
		// 그러나 형변환은 가능
		
		// RemoteControl rc1 = new RemoteControl(); ▶ 객체 생성 불가
		Audio audio1 = new Audio(); 
		audio1.turnOn();
		audio1.turnOff();
		
		System.out.println("------------------------♡");
		
		
		RemoteControl rc = audio1;
		rc.turnOn();
		rc.turnOff();
		
		
		System.out.println("------------------------★");

		
		rc = new Tv();
		rc.turnOn();
		rc.turnOff();
		
	}

}
