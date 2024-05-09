package EX;

import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		//  나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요. " );
		int a = scan.nextInt();
		
		String b = a>19 ? "성인" : (a>13 ? "청소년" : "어린이");
		
		System.out.println(b);
		
		
	}

}
//맞음