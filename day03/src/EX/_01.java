package EX;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {

		// 1. 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		System.out.println(a>0 ? "양수" : "양수가 아니다");
		

	}

}
//맞음