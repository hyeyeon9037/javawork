package EX;

import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		// 10. 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 적으세요(1) : ");
		int num1 = scan.nextInt();
		
		System.out.println("숫자를 적으세요(2) : ");
		int num2 = scan.nextInt();
		
		System.out.println("숫자를 적으세요(3) : ");
		int num3 = scan.nextInt();
		
		boolean a = num1 == num2 && num2 == num3;
		
		System.out.println(a);
		

	}

}
//틀림 
// 위에 정답이 맞는다뇽 ! 이해완료><