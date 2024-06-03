package _01_Lamda;

public class T01_lamda {

	public static void main(String[] args) {
		/* MyFuction을 쓸 때 ) 
		람다식을 사용할 때에 사용하는 interface
		1. 추상메서드로 구현
		2. 추상메서드는 반드시 1개만 있어야 된다.
		
		*/
		// 매개변수가 없을 때 
		MyMethod mm1 = new MyMethod() {
			@Override
			public void method() {
				System.out.println("method() call");
			}
			
		};
		mm1.method();
		mm1 = () -> {
			System.out.println("람다에서 출력");
		};
		mm1.method();
		
		/*
			mm1 = () -> {
			System.out.println("람다에서 출력");
		};
		이 부분은
		
		매개변수가 없을 때에는 () 괄호를 꼭 써야 오류가 안뜬다.
		한 줄일때에는 {} 생략 할 수 있다.
		
		
		mm1 = () -> System.out.println("람다에서 출력");
			
		
		
		*/
	}
}
