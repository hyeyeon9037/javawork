package _03_abstract;

public class PhoneRun {

	public static void main(String[] args) {
		
		Phone phone1 = new FolderPhone("홍길동"); //객체생성 (부모타입으로)
		phone1.turnOn();
		phone1.turnOff();
		
		phone1 = new SmartPhone("이순신");
		phone1.turnOn();
		phone1.turnOff();
		
	}

}
