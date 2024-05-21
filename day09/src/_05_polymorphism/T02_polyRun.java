package _05_polymorphism;

class Parent{
	void method1() {
		System.out.println("Perent method1()");
	}
		void method2() {	
		System.out.println("Perent method2()");

	}
}


	class Child extends Parent {
		@Override // 오버라이딩을 한 곳을 반환[호출]하는 것 (부모에서 있는지 확인해주는것)
		void method2() {
			System.out.println("Child method2()");
		}
		void method3() {
			System.out.println("Child method3()");
		}
	}








public class T02_polyRun {

	public static void main(String[] args) {

		/*Child child = new Child();
		Parent parent = child;*/
		// 이 두개를 한 줄로 줄이려면 ? 
		Parent parent2 = new Child();
		parent2.method1();
		// ★ 오버라이딩한 메소드는 형 변환과 상관없이 무조건 객체를 생성한 곳에 들어있는 메소드 호출
		parent2.method2();
		
		
		
		
		
		
	}

}
