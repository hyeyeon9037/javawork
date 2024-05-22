package _02_exception;

import java.util.Scanner;

public class T08_arithmetic {

	public static void main(String[] args) {
		// 사용자로부터 2수를 입력받아 나눈 몫 출력, 나눈 나머지 출력
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 두개를 입력하세요.");
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	try {
		System.out.println("몫 : " + a/b);
		System.out.println("나머지 : " + a%b);
		
	}catch(ArithmeticException e) {
		System.out.println("정수만 가능합니다");
		
	}
	
	}
}


