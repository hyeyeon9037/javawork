package _02_conditional;

import java.util.Scanner;

public class T01_if {

	public static void main(String[] args) {
		// 조건문
		/*
		 * if (조건식) {
		 * 조건이 참일때 실행할 프로그램
		 * }
		 */
		
		
		int num1 = 100;
		if(num1 != 100); // 여기서 ; 붙이면 안댐 
			System.out.println("100점이 아닙니다.");
			// if문의 실행할 코드가 한줄일때는 중괄호 {}를 안넣어도 되고 넣어도 된다.
		
			if (num1 == 100) {
				System.out.println("100점 입니다.");
				System.out.println("안녕");
			}
			// if문의 실행할 코드가 한줄 이상일때는 반드시 중괄호를 넣어준다.
			
			
			int num2 = 95;
			if (num1 < num2) {
				System.out.println(num1 + "은" + num2 + "보다 작다.");
			}
				System.out.println("if의 조건과 상관없이 실행합니다");
				// 이렇게 하면 중괄호를 안했기 때문에 첫번째 껏만 출력되고 두번째꺼는 출력이 된다. 
				// 그래서 중괄호를 써주는것이 사람 보는 눈에 좋음.
				
			// 문제1)사용자로부터 점수를 입력받아 80점 이상이면 합격입니다. 축하합니다. 따로따로 쓰기
				
				Scanner scan = new Scanner(System.in);
				System.out.println("점수를 입력하세요. : ");
				int a = scan.nextInt();
				
				if ( a >= 80) {
					System.out.println("합격입니다.");
					System.out.println("축하입니다.");
				}
				
				
		
		
	}

}
