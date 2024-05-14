package _01_array;

import java.util.Scanner;

public class _ex03 {

	public static void main(String[] args) {
		// 사용자로부터 입력 받은 수 만큼 배열을 만들고 1~입력받은 수를 차례대로 넣어 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 숫자를 적으세요. : ");
		int user = sc.nextInt();
		
		int intArr [] = new int[user];
		
		for(int i = 0; i<user; i++) {
			intArr[i] = i+1;
			System.out.print(intArr[i]+ ", ");
			
		}
		
		
		
	}

}
