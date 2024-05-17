package _06_static;

public class T01_api_static {
	// 인스턴스 필드(속성)
	
	int num = 10; // 변수	 <인스턴스 필드>
	final int MAX = 25;   // 상수(final)는 나중에 변경할 수 없음 !   <인스턴스 필드>
	
	void method1() { // 매개변수도 지역변수
		// 매소드 안에 있는 것 지역변수
		int me1 = 3;
		System.out.println(me1);
	}
	
	// 정적필드 (속성)
	
	static int sNum = 20;
	static String sName = "박혜연";
	
	
}
