package _01_array;

import java.util.Scanner;

public class _ex06 {

	public static void main(String[] args) {
		/*
		배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아 숫자와 같은 요일 출력
		   ex.
		   0 ~ 6 사이 숫자 입력 : 4			
		   금요일
		   0 ~ 6 사이 숫자 입력 : 7
		   잘못 입력하셨습니다.*/

		Scanner scan = new Scanner(System.in);
		
		char[] days = {'월','화','수','목','금','토','일'};
		System.out.println("0~6사이 숫자 입력 : ");
		int iarr = scan.nextInt();
		
		
		if(iarr >= 0 && iarr <=6) {
			System.out.println(days[iarr] + "요일");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
		
		
		
		
		
		
		
	}

}
