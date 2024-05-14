package _02_mthod;

public class T01_api_method {
	 // 반환형이 없는 메소드
	void print1() {
		System.out.println("반환 값이 없고 매개변수도 없는 메소드");
	}
	
	// 반환형이 있는 메소드
	int print2() {
		System.out.println("반환 값이 int이고 매개변수는 없는 메소드");
		return 10;
		
	}
		String print3() {
			System.out.println("반환 값이 String이고 매개변수는 없는 메소드");
			return "반환되는 문자";
		}
	
		//매개변수
		
		void print4(int x) { //void는 반환값이 없음 , main에서는 int x 에 값을 넣어줘야함 
			System.out.println(x);
			
		}
		
		
		int print5(int x, int y) {
		
			return x+y;
			
			/*
			return x+y; 랑 같은말임
			
			int result = x+y;
			return result;
			
			*/
		}
		
		
		void print6(String str, int z) {
			System.out.println("입력한 문자열 : " + str);
			System.out.println("입력한 숫자 : " + z);
		}
		
		
	}
	

