package _04_super;



	class Parent3 {
		int x;	//부모 변수
		int z;
		Parent3() { // 생성자
			System.out.println("부모 생성자 호출");
			x = 10;
			z = 10;
		}
	}
	
	
	class Child3 extends Parent3 {
		int x;
		int y;
		Child3() {
			System.out.println("자식 생성자 호출");
			x = 10*10;
			y = 10*10;
		}
	}
	
	class GrandChild extends Child3 {
		int x;
		GrandChild() {
			System.out.println("손자 생성자 호출");
			x = 10*10*10;
		}
	}
	
	public class T03_SuperRun {
	public static void main(String[] args) {
	
		GrandChild c = new GrandChild();
		System.out.println(c.x);
		// System.out.println(c.super.x); → 호출 불가능 super는 반드시 상속 받은 곳에 있어야함. 호출하고 싶으면 메소드를 따로 만들어서 호출 해야한다.
		System.out.println(c.y);
		System.out.println(c.z);
		
		
	}

}
