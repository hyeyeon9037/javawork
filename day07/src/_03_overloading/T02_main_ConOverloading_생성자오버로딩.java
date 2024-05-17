package _03_overloading;

class Aaa{
	int num;
	double dou;
	String name;
	
	
	Aaa() {
		num = 1;
		dou = 1.0;
		name = "박혜연";
		System.out.println("매개변수가 없는 생성자");
		// 생성자에 아무것도 안넣으면 이 값이 나온다.
	}
	
	Aaa(int num) {
		
		this.num = num;
		dou = 1.0; // 지역변수 없으니깐 this 안넣어도대
		name = "박혜연";
		System.out.println("매개변수가 1개인 생성자");
	}
	
	Aaa(int num, double dou) {
		this.nu                                                                                     m = num;
		this.dou = dou;
		this.name = "박혜연";
		System.out.println("매개변수가 2개인 생성자(int, double)");
		
	}
	
	Aaa(int num, String name) {
		this.num = num;
		dou = dou;
		this.name = name;
		System.out.println("매개변수가 2개인 생성자(int, String)");
	}
	
	Aaa(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자");
	}
	
	
	/* 가변인자 (...) : 들어올 인자의 갯수를 모를때 씀
	                  가변인자를 넣어줬을땐 뒤에다가 넣어줘야함
					  같은 자료형 일때에는 오버로딩을를 잘 쓰지않는다.
					  가변인자는 0개이상 넣는 것
					  
	인자는 변수명이라고 생각하쟈
	*/ 
	
	void method(int...num) {  // int... str 은 인자는 "0개 이상" 이라는 뜻
		System.out.println("인자가 0개 이상");
	}
	
	void method(String name, String... str) { // 인자는 "1개 이상" 이라는 뜻 why? String name 은 무조건 1개이상 넣어야하고 String...str 은 안넣어도 되기때문에.
		System.out.println("인자가 반드시 1개 이상");
	}
	
	
	
	/*void method(String num, String... str) { 
		이렇게는 안댐 , 모든 인자는 가변인자에 들어가기 때문
	}*/
	
	
	
}

public class T02_main_ConOverloading_생성자오버로딩 {

	public static void main(String[] args) {
		
		
		Aaa a1 = new Aaa();
		Aaa a2 = new Aaa(5,10.56, "혜연이");
		Aaa a3 = new Aaa(10, "혜연");
		Aaa a4 = new Aaa(50, 50.1234);
		a4.method(5);
		a4.method("문자");
		a4.method(0);
		
		
		
		
		
		

	}

}
