package _02_conditional;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		/*
		 if(조건식) {
		 	조건이 참일 때 실행할 프로그램
		 	} else {
		 	조건이 거짓일 때 실행할 프로그램
		 	}
		 	
		 */
		
		
		int num1 = 100;
		if(num1 > 0 )
			System.out.println("양수");
		else
			System.out.println("양수가아니다");
		
		//실행할 프로그램이 한줄 이상이면 중괄호를 반드시 넣어야 함
		
		int score = 98;
		if(score >= 80) {
			System.out.println("축하합니다.");
			System.out.println("합격합니다.");
		} else {
			System.out.println("불합격입니다");
			System.out.println("다음 기회에");
		}
		
		
		
		//문제1) 사용자로부터 숫자 하나를 입력받아 짝수인지 홀수인지 가리시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오. : ");
		int a = scan.nextInt();
		
		if ( a%2 ==  0) {
			System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		

		
		
		
	}

}
