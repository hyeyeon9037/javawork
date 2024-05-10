package _02_repetitive;

public class T05_random {

	public static void main(String[] args) {
		// Math클래스 (수학에 관련된 클래스)
		
		Math.random();
		double random1 = Math.random();
		System.out.println(random1); // 실수형 : 0 ~ 0.99999999999999999999999 
		System.out.println("--------------------------------------------");
		
		random1 = Math.random() * 10;
		System.out.println(random1); // 실수형 : 0 ~ 0.99999999999999999999999 * 10
		System.out.println("--------------------------------------------");
		
		int random2 = (int)random1;  // 정수로 강제 형변환 
		System.out.println(random2); // 정수 : 1 ~ 9
		System.out.println("--------------------------------------------");
		
		int random3 = (int)random1 +1; // 10까지 하고 싶으면 +1 하면댐
		System.out.println(random3); // 정수 : 1 ~ 10
		System.out.println("--------------------------------------------");
		
		// 0~4까지 숫자 중 랜덤으로 추출
		// 0~0.9999 * 5 = 0 ~ 4.99999
		
		int random4 = (int)(Math.random()*5); // 0~4
		System.out.println(random4);
		
		int random5 = random4 +1; // 1~5
		
		
		
		
	}

}
