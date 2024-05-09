package EX;

import java.util.Scanner;

public class _09 {

	public static void main(String[] args) {
		/*

키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요. 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고 아니면 false를 출력하세요.
   (단, num1은 num2보다 작아야 함)
   ex.
   정수1 : 4
   정수2 : 11
   입력 : 13
   
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1 : ");
		int num1 = scan.nextInt();
		
		System.out.println("정수2 : ");
		int num2 = scan.nextInt();
		
		System.out.println("입력 : ");
		int num3 = scan.nextInt();
		
		boolean b = num3 <= num1 || num3 > num2;
		System.out.println(b);
		
	
	}

}

//틀림 이해완료!! 집가서 다시 해보쟈 !
