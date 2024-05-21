package _04_super;



	class Parent {
		int x = 10;	//부모 변수
	}
	
	
	class Child extends Parent {
		int x = 20; // 인스턴스 변수
		void show() {
			int x = 30; // 지역변수
			System.out.println("x=" + x); // 지역변수 →  (지역이 없으면) 인스턴스 변수 →  (인스턴스가 없으면) 부모 변수
			System.out.println("this.x=" + this.x); // 인스턴스 변수 → (인스턴스가 없으면) 부모 변수
			System.out.println("super.x=" + super.x); // super가 들어가면 무조건 부모 변수
		}
	}
	
	
	public class T01_SuperRun {
	public static void main(String[] args) {
	
	Child c = new Child();
	c.show();
	
		
		
		
	}

}
