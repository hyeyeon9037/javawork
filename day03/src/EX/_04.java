package EX;

import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {
		//  모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 
		//  1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("인원 수를 적으세요. : ");
		int a = scan.nextInt();
		
		System.out.println("사탕 개수를 적으세요. : ");
		int b = scan.nextInt();
		
		int c = b/a;
		int d = b%a;
		
		System.out.println("동일하게 나눠진 사탕 개수 : " + c);
		System.out.println("남은 사탕의 개수 : " + d);
		
		
		
		
		
	}

}

//정확하게 맞았따 !! ><ㄴ