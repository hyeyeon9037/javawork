package _01_casting;

import java.util.Scanner;

public class T04_ex04 {

	public static void main(String[] args) {
		/*
	1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
   이름을 입력하세요 : 아무개
   성별을 입력하세요(남/여) : 남
   나이를 입력하세요 : 20
   키를 입력하세요(cm) : 180.5
   키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요. : ");
		String name = scan.next();

		
		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = scan.next().charAt(0);
		
		System.out.println("나이를 입력하세요. : ");
		int age = scan.nextInt();
		
		
		
		
		
	}

	
}
