package _01_conditional;

import java.util.Scanner;

public class T01_switch_case_ex01 {

	public static void main(String[] args) {
		/* 문제 1) 사용자로부터 2수와 연산자를 입력 받아 연산 결과를 출력하시오.
		/  
		ex
		첫번째 숫자 : 3 
		두번째 숫자 : 1 
		연산자입력 : (+,-,*,/,%)
	
		char, string 으로 둘다 해보기.
		
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 : ");
		int a = sc.nextInt();
		
		System.out.println("두번째 숫자 : ");
		int b = sc.nextInt();
		
		System.out.println("연산자 입력 : ");
		String c = sc.next();
		
		switch (c) {
		
		case "+" :
			System.out.println("연산 결과는 " + (a+b) );
			break;
			
		case "-" :
			System.out.println("연산 결과는 " + (a-b) );
			break;
			
		case "*" :
			System.out.println("연산 결과는 " + a*b);
			break;
			
		case "/" :
			System.out.printf("연산 결과는 %.2f" , (double)a/b);
			break;
			// 나머지가 있기땜 double 선언 ㄱㄱ
		case "%" : 
			System.out.println("연산 결과는 " + a%b);

		}
	}

}


// 교수님이 한거 따라해보기