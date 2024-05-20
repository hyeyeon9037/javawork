package _01_phone;

public class api_SmartPhone extends api_Phone {
	// 검색할 것만 적어주면 돼
	String search;
	
	// 부모의 생성자에 매개변수가 있으면 자식도 반드시 생성자가 있어야 한다.
	// 부모 생성자의 인자값을 넘겨 줘야함 → why?) 자식의 객체를 생성하면 부모의 객체도 생성함
	// () 괄호 안에 있는 것은 '매개변수' 라고 부름
	api_SmartPhone(String model, String color){
		super(model, color);
		// super : 부모의 생성자 호출
		// 값을 넣어줄땐 () 괄호 안에 있는 것은'인자' 라고 부름
	}
	
	String search(String search) {
		this.search = search;
		return this.search + "를 검색합니다.";
	
	}

		
	
	
}
