package _01_casting;

import java.util.Scanner;

public class T05_ex05 {

	public static void main(String[] args) {
		/*
2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

   ex.
   첫 번째 정수 : 23
   두 번째 정수 : 7

   더하기 결과 : 30
   빼기 결과 : 16
   곱하기 결과 : 161
   나누기 몫 결과 : 3
   
		 */
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("첫 번째 정수 : ");
	int a = scan.nextInt();
	System.out.println("두 번째 정수 : ");
	int b = scan.nextInt();
	
	
	System.out.println("더하기 결과 : " + (a+b));
	System.out.println("빼기 결과 : " + (a-b));
	System.out.println("곱하기 결과 : " + a*b);
	System.out.println("나누기 몫 결과 : " + a/b);
	
	
		
	}
}
