package _01_static;

public class T01_api_static {

	
	//인스턴스 필드
	int numIn = 3;
	String nameIn = "어턴스";
	
	
	//정적 필드 (클래스 변수)
	static int numSt = 10;
	static String nameSt = "김정적";
	
	//인스턴스 메소드
	void me1() { //인스턴스 메소드를 호출한다는 것은 이미 "객체가 생성"되어 있다는 소리다.
		 		// 인스턴스 변수, 메소드, 클래스 변수, 메소 모두 호출 가능
		       // 객체가 생성
		
		System.out.println("인스턴스 메소드 me1()");
		System.out.println(numIn);

		System.out.println(numSt);
	}
	
	String me2() {
		System.out.println("인스턴스 메소드 me2()");
		return "me2()";
	}
	
	
	//정적 메소드
	static void sMe3() { //클래스에 저장 공간이 있으므로 "객체를 생성하지 않고"도 사용가능하다.
		    			 //인스턴스 변수 사용 불가 인스턴스 변수(메소드)는 반드시 객체가 생성되어야만 사용할 수 있기 때문
		System.out.println("정적 메소드 : sMe3() : ");
		System.out.println(numSt);
		// System.out.println(numIn);  → 오류 원인 : 클래스만 올라와있을 뿐 객체는 안만들어져 있음 그래서 사용 불가능
	}
	
	static String sMe4() {
		System.out.println("정적 메소드 : sMe4()");
		return "sMe4()";
	}
	
	
	
	
}
