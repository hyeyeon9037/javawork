package _01_casting;

import java.util.Scanner;

public class T04_ex02 {

	public static void main(String[] args) {
		// 2. 국어, 영어, 수학 점수를 입력받아 총점 출력 , 평균 출력(소수점 2째자리까지 출력)
		// 난 평균은 질문해야함 ㅜㅜ
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요. : ");
		int K = scan.nextInt();
	
		
		System.out.println("영어 점수를 입력하세요. :");
		int E = scan.nextInt();

		
		System.out.println("수학 점수를 입력하세요. : ");
		int M = scan.nextInt();
	
		
		int sum = K+E+M;
		double avg = (double) sum/3;
		
		System.out.println("총점 : " + sum);
		
		System.out.printf("평균 : %.2f\n " , avg );
		
		
	}

}
