package _03_overloading;
// class 가 두개임!


class over {
	/* 오버로딩의 조건
	 1. 메소드 이름이 같아야 한다.
	 2. 매개변수의 개수가 다르던지 자료형이 달라야 한다.
	*/
	
	int add() {
		return 0;
	}
	     // ↓ int 즉 () 괄호 안에 있는 int가 자료형임
	int add(int num1) {
		return num1;	
	}
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	double add(int num1, double num2) {
		return num1 + num2;
	}
	
	String add(String name) {
		return " 이름 : " + name;
	}
	
}



public class T01_main_MethodOverloading {

	public static void main(String[] args) {

		over o1 = new over();
		o1 = new over();
		System.out.println(o1.add(3,5));
		System.out.println(o1.add(3,5.0));
		System.out.println(o1.add());
		System.out.println(o1.add(7));
		System.out.println(o1.add("박혜연"));
		
	}

}
