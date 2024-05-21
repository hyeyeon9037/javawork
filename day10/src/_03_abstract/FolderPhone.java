package _03_abstract;

public class FolderPhone extends Phone {

	FolderPhone(String owner) {
		super(owner);
		
	}

	@Override
	void turnOn() {
		System.out.println("뚜껑을 열어서 전화를 받음");
	}

	@Override
	void turnOff() {
		System.out.println("종료 버튼을 눌러 전화 끊음");

	
	}
	
	void search(String search ) {
		System.out.println( search + "를 검색함");
	}
	
	
}
