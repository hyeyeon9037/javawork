package _03_Scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
	
		// 문제1) 국어, 컴퓨터, 수학 점수를 입력받아 저장하고 총점과 평균을 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요. ");
		int G = scan.nextInt();
		System.out.println("국어 점수 : " + G);
		
	
		System.out.print("컴퓨터 점수를 입력하세요. ");
		int C = scan.nextInt();
		System.out.println("국어 점수 : " + C);
		
		System.out.print("수학 점수를 입력하세요. ");
		int S = scan.nextInt();
		System.out.println("국어 점수 : " + S);
		
		/*int total = G + C + S;
	
		int aver = total /3;
		
		System.out.printf("당신의 총점은 %d점, 평균은 %d입니다.", total, aver);
			 */
		
		System.out.println("총점" + (G+C+S));
		System.out.println("평균" + (G+C+S)/3);
		
	}

}
