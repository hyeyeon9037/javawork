package _01_print;

public class T02_printf {

	public static void main(String[] args) {

		System.out.printf("%d\n", 3);
		System.out.printf("%d, %d\n", 10, 20 );
		
		int num1 = 100;
		int num2 = 200;
		System.out.printf("%d, %d\n", num1, num2);
		// 10진수 출력
	
		
		System.out.printf("%o\n", 9);
		// 8진수 출력
		
		System.out.printf("%x\n", 13);
		System.out.printf("%X\n", 13);
		// 16진수 출력
		
		
		System.out.printf("%f\n", 3.55555555555555);
		// 실수형 출력 , 뒤에 소숫점이 아무리 많아도 6자리로만 나오며 맨 뒤에 반올림해서 출력됨
		
		System.out.printf("%c\n", 'H');
		// 문자 1개 출력
		
		System.out.printf("%s\n", "Hyeyeon");
		// 문자열 출력
		
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", 7>3);
		//boolean타입 출력
		
		
		//문제1) 현재는 2024년 5월 이고, 우리나라의 평균 키는 165.7입니다.
		
		System.out.printf("현재는 %d년 %d월 이고, 우리나라의 평균 키는 %f입니다.", 2024, 5, 165.7);
		
		// 문제2) 이 과정의 정원은 25명이고, 현재 25명 수강중 입니다. 100%를 달성했습니다.
		
		System.out.printf("이 과정의 정원은 %d명이고, 현재 %d명 수강중 입니다. %d%c를 달성했습니다.", 25, 25, 100, '%'); // %를 표현 할떄 %c 대신 %%도 가능
		
		

		
		
	}

}
