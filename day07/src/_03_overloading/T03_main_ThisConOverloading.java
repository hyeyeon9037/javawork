package _03_overloading;

class ThisAaa{
	int num;
	double dou;
	String name;
	
	/*
	생성자에서 this() : 다른 생성자를 호출하는 것
	this()는 맨 첫줄에 넣어야 함
	
	*/
	ThisAaa() {
		this(1,1.0,"박혜연"); //this는 무조건 맨처음에 넣어줘야함!
		/* this(~, ~, ~) 랑 똑같은 말 
		num = 1;
		dou = 1.0;
		name = "박혜연";*/
		System.out.println("매개변수가 없는 생성자");
		
	}
	
	ThisAaa(int num) {
		this(num,1.0,"박혜연");
		/*this.num = num;
		dou = 1.0; 
		name = "박혜연";*/
		System.out.println("매개변수가 1개인 생성자");
	}
	
	ThisAaa(int num, double dou) {
		this(num, dou,"박혜연");
		
		/*this.num = num;
		this.dou = dou;
		this.name = "박혜연";*/
		System.out.println("매개변수가 2개인 생성자(int, double)");
		
	}
	
	ThisAaa(int num, double dou, String name) {
		
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자");
	}
	
	
}

public class T03_main_ThisConOverloading {

	public static void main(String[] args) {
		
		
		ThisAaa a1 = new ThisAaa();
		/*ThisAaa a2 = new ThisAaa(5,10.56, "혜연이");
		ThisAaa a4 = new ThisAaa(50, 50.1234);
		*/
		
		
		
		
		

	}

}
