package _01_array;

import java.util.Scanner;

public class T03_EX01 {

	public static void main(String[] args) {
		/* 사용자로부터 3사람의 국어, 수학, 컴퓨터 점수를 입력하세요.
		
		ex)
		
		번호  국어  수학  컴퓨터  총점  평균
		--------------------------------
		1    90	  100  100   290  96.xx
		2    90	  100  90    290  95.xx
		3    90	  80   100   290  90.xx
		--------------------------------
	    총점  270  280   290
		평균  90   93.xx  97.xx
		
		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 학생 국어 점수 : ");
		score[0][0] = scan.nextInt();
		System.out.println("첫번째 학생 수학 점수 : ");
		score[0][1] = scan.nextInt();
		System.out.println("첫번째 학생 컴퓨터 점수 : ");
		score[0][2] = scan.nextInt();
		하나하나 다 적으려면 이렇게 해야함
		*/
		
		/*
		
		System.out.println(1 + ". 번째 학생 국어, 수학, 컴퓨터 점수 입력 : ");
		score[0][0] = scan.nextInt();
		score[0][1] = scan.nextInt();
		score[0][2] = scan.nextInt();
		
		System.out.println(2+ ". 번째 학생 국어, 수학, 컴퓨터 점수 입력 : ");
		score[1][0] = scan.nextInt();
		score[1][1] = scan.nextInt();
		score[1][2] = scan.nextInt();
		이렇게도 가능 (여기서 규칙을 보고 for문으로 바꾸는걸 생각해보자.)
		*/
		
		Scanner scan = new Scanner(System.in);
		int score[][] = new int[3][3];
		
		
		for (int i=0; i<score.length; i++) {
			System.out.print(i+1 + ". 번째 학생 국어, 수학, 컴퓨터점수 입력 : ");
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = scan.nextInt();
				System.out.print(score[i][j] +  ", ");
			}
			System.out.println();
			
		}
		
		// 여기까지 출력문 " 1~3번째 학생 국어, 수학 컴퓨터 점수 입력 : ~, ~, ~ " 이 나옴
		
	
		/*
		sum += score[0][0]
		sum += score[0][1]
		sum += score[0][2]
		*/		
				System.out.println("번호\t국어\t수학\t컴퓨터\t총점\t평균");
				System.out.println("-------------------------------------------");
				for (int i=0; i<score.length; i++) {
					System.out.print(i+1 + "\t");
					int sum = 0;
					
					for(int j=0; j<score[i].length; j++) {
					
						System.out.print((score[i][j]) + "\t");
						sum += score[i][j];
						
					}
					
					System.out.print(sum + "\t"); // 1번째 학생의 총점이 들어가있음 끝나고나서 다시 for문으로 하려면 sum을 0으로 초기화시켜줘야함 그래서 맨처음 for문에 sum = 0; 을 써준거임
					System.out.printf("%.2f\n", (double)sum/score[i].length);
				}
		
		
		
		
		
		
		
		
		
		
		
	}

}
