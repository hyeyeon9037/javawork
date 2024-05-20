package _04_super;



	class Parent2 {
		int x = 10;	//부모 변수
		void show() {
			System.out.println("부모 클래스의 메소드");
		}
	}
	
	
	class Child2 extends Parent2 {
		int x = 20; // 
		void show() {
			System.out.println("자식 클래스의 메소드");
		}
		void display()	{
			show(); // 위에 있는 void show()를 호출하는 것
			super.show(); // 부모의 void show()를 호출하는것
			System.out.println("this.x = " + this.x);
			System.out.println("super.x = " + super.x);
		}
	}
	
	public class T02_SuperRun {
	public static void main(String[] args) {
	
	Child2 child = new Child2();
	child.display();
	
		
		
		
	}

}
