package EX;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		// // 2. 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		System.out.println(a>0 ? "양수다" : (a<0 ? "음수다" :  "0이다" ));

	}

}
// 맞음