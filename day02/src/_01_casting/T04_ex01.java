package _01_casting;

import java.util.Scanner;

public class T04_ex01 {

	public static void main(String[] args) {
		
		
		// 문제1) 문자 하나를 입력받아 그 문자의 유니코드를 출력하기 (정답!)
	
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print(" 문자를 한 개만 입력하시오 : ");
		char a = scan.next().charAt(0);
		// String a = scan.next(); 도 가능
	
		System.out.println(a);
		int b = a;
		System.out.println(" 이 문자의 유니코드는 " + b + "입니다.");
	

	}

}
