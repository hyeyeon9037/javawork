package _02_mthod;

public class T01_main_method {

	public static void main(String[] args) {
		
		T01_api_method ob1 = new T01_api_method();
		ob1.print1();
		//반환형이 없는 메소드는 변수에 저장할 수도, 출력할 수도 없다.
		// int abc = ob1.print1(); 불가능
		// System.out.println(ob1.print1(); 불가능
		
		
		ob1.print2(); // 출력문이 나오고, return값이 들어옴
		
		int result = ob1.print2(); // 10이 들어와서 system.out으로 해주면 밑에 출력값이 "10" 이 나옴
		System.out.println(result);

		System.out.println("----------------------------");
	
		System.out.println(ob1.print3()); // 출력문과 return값이나옴
		
		
		System.out.println("----------------------------");
		
		ob1.print4(5); // 5는 int x 에 값을 넣어준거임 
		
		System.out.println("----------------------------");
		
		int re2 = ob1.print5(7, 8);
		System.out.println(re2);
		
		System.out.println("----------------------------");
		
		ob1.print6("더조은", 100);
		
		System.out.println("----------------------------------T02_api_method의 api");
		
		T02_api_method ob2 = new T02_api_method();
		
		// 복잡
		int Readd = ob2.add(5, 6);
		System.out.println(Readd);
		
		System.out.println("----------------------------1");
	
		int Remin = ob2.min(5, 6);
		System.out.println(Remin);
		
		System.out.println("----------------------------2");
		
		int Remult = ob2.mult(5, 6);
		System.out.println(Remult);
				
		System.out.println("----------------------------3");
		
		double Redivide = ob2.divide(5, 6);
		System.out.printf(".2%f", Redivide);
		
		System.out.println();
		System.out.println("----------------------------4");
		
		
		// 간단
		
		System.out.println(ob2.add(5, 9));
		System.out.println(ob2.min(5, 9));
		System.out.println(ob2.mult(5, 9));
		System.out.println(ob2.divide(5, 9));
		
		
	}

}
