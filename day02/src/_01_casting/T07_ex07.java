package _01_casting;

import java.util.Scanner;

public class T07_ex07 {

	public static void main(String[] args) {
		/*

 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.

   ex.
   문자열을 입력하세요 : apple

   첫 번째 문자 : a
   두 번째 문자 : p
   세 번째 문자 : p
   
		 */

		// 안보고 풀어보기 이건 좀 어렵당.
		Scanner scan = new Scanner (System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String a = scan.next();
		
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(2));
		
		
	}

}
