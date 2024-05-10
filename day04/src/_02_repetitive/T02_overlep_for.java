package _02_repetitive;

import java.util.Scanner;

public class T02_overlep_for {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) { 
		for(int j=1; j<=5; j++) {
			System.out.println("i="+ i + ", j=" + j );
		}
			System.out.println(); // 바깥 for문 1번, 안쪽 for문 5번 을 다하고 나면 줄바뀜을 해주는 것
		}
		
		// i=1, j=1~5 | i=2, j=1~5 | i=3, j=1~5 이렇게 구동 !
		// i가 한개 돌아갈대 j는 5번이 돌아가는것 ∴ 바깥에있는 for문보다 안에있는 for문이 더 많이 구동됨
		
		
		// 구구단
		/*
		 
		 ***2단***
		 2*1 = 2
		 2*2 = 4
		 ...
		 2*9 = 18
		 
		 ***3단***
		 3*1 = 3
		 3*2 = 6
		 ...
		 3*9 = 27
		 이렇게 9 단까지 만들어보자.
		 
		 */
		
		for(int i=2; i<=9; i++) {
			System.out.println("*** "+ i + "단 ***");
			
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j  );
			}
		System.out.println();
		}
		
		
		
		/*
		 
		 ex)
		 
		 숫자입력 : 2
		 
		 *
		 **
		 
		 숫자입력 : 6
		 
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		  
		  사용자로부터 숫자를 입력받아 그 숫자만큼 *를 출력해보시오.
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) { // 사용자가 숫자를 썼을때 받는 거
			for(int j=1; j<=i; j++) { // *를 몇번 할 것인지
				System.out.print("*"); // ln 안씀 
			}
			
			System.out.println();
			
			}
		
		
	
		
		}
		
	}


