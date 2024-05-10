package _02_repetitive;

public class T01_for {

	public static void main(String[] args) {
		// 반복문
		/*
		 반복문 3가지 for, while, do-while
		 특정한 규칙이 있는 것들을 반복하여 사용할 때
		 
		 for(초기화; 조건식; 증감식) {
		 실행문
		 }
		 
		 
		 */

		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		// 이런식으로 똑같이 안녕하세요를 10개를 가져오고 싶을때에는? ↓ 하는것처럼 ㄱㄱ
		
		System.out.println("-----------------------------------");
		
		
		for(int i=1; i<=10; i++) {
			System.out.println(i+". 안녕하세요");
			// 출력값 : 1~10. 안녕하세요
		}
		
		
		System.out.println("-----------------------------------");
		
		
		for(int i=1; i<=100; i++) {
			System.out.println(i+". 안녕하세요");
			// 출력값 : 1~100. 안녕하세요
		}
		
		
		System.out.println("-----------------------------------");
		
		
		for(int i=1; i<10; i+=2) { // i+=2 i값을 2씩 증가시킨다는 말
			System.out.println(i+". 안녕하세요");
				// 출력 값 : 1, 3, 5, 7, 9. 안녕하세요
		}
		
		
		System.out.println("-----------------------------------");
		
		for(int i=10; i>=1; i--) {
			System.out.println(i + ". 1씩 감소");
			// 출력값 : 10~1. 1씩 감소
		}
		
		System.out.println("-----------------------------------");
		
		// 1~100까지의 합계 구하기
		int sum = 0;
	
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println("1~100까지의 합 : " + sum );
		
		sum = 0;
		for (int i=1; i<=10; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		
		System.out.println("1~10까지 3의 배수 합 : " + sum );
		
		
	}

}
