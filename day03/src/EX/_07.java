package EX;

import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		/*
		 * 
국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데  세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		int K = scan.nextInt();
		
		System.out.println("영어 점수 : ");
		int E = scan.nextInt();
		
		System.out.println("수학 점수 : ");
		int M = scan.nextInt();
		
		int a = K+E+M;
		double b = (K+E+M)/3;
		
		System.out.println("합계 : " + a);
		System.out.println("평균 : " + b);
		
		System.out.println(K>=40 && E>=40 && M>=40 && b>=60 ? "합격" : "불합격");
				
		
		
	}

}
// 맞음     국어,영어,수학 점수를 한번에 나오게 출력해보자!,
