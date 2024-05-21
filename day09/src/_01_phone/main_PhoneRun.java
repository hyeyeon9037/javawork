package _01_phone;

public class main_PhoneRun {

	public static void main(String[] args) {
		api_SmartPhone sPhone1 = new api_SmartPhone("note20", "white");
		System.out.println("model명 : " + sPhone1.model);
		System.out.println("clolor : " + sPhone1.color);
		
		sPhone1.bell();
		sPhone1.hangUp();
		sPhone1.receveVoice("ㅎㅇㅎㅇ");
		sPhone1.sendVoice("ㅇㅇ 방가");
		sPhone1.hangOut();
		
		api_Phone phone1 = new api_Phone("apple3", "black");
		phone1.bell();
		phone1.hangOut();
		// phone1.search(); → search 는 사용 불가 → 자식한테 선언해서 부모가 쓸 수 업슴.
		
		
	}

}
