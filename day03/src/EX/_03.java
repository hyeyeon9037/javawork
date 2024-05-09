package EX;

import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {
		// 3.키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		// ? / 2 = 나머지 0 나와야 짝수 나머지가 있으면 홀수
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. : ");
		int a = scan.nextInt();
		
		System.out.println( a%2 == 0 ? "짝수" : "홀수");
		
	
		
		
		
	}

}
//틀림
// ( 이해 완 위에있는 건 맞는 답임  )
