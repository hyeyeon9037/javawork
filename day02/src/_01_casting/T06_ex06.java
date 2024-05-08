package _01_casting;

import java.util.Scanner;

public class T06_ex06 {

	public static void main(String[] args) {
		/*
3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
   계산 공식 ) 면적 : 가로 * 세로
	     둘레 : (가로 + 세로) * 2

   ex.
   가로 : 13.5
   세로 : 41.7

   면적 : 562.95
   둘레 : 110.4
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로 값 : ");
		double a = scan.nextDouble();
		System.out.println("세로 값 : ");
		double b = scan.nextDouble();
		
		double ab = a*b;
		double c = (a+b)*2;
				
		System.out.println("사각형의 면적 : " + ab	);
		System.out.println("사각형의 둘레 : " + c );
		
	}

}
