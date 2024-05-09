package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
	 
		int num1 = 10;
		int num2 = 7;
		
		// 삼항연산자 : 조건식
		// ? → 조건이 참일때 실행 : → 조건이 거짓일때 실행
		
		String re = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다";
		// t이면 문자열 왼쪽, f이면 문자열 오른쪽이 나옴
		System.out.println(re);
		System.out.println(num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다" ); // 위에처럼 해도 되고 출력문에다가 해도 됨
		
		
		
		System.out.println("------------------------------");
		
		
		// 숫자를 무조건 양수로 출력
		int num3 = -8;
		
		System.out.println(-num3);
		System.out.println(num3 < 0 ? -num3 : num3);
		
		System.out.println("-둘다 똑같음-");
		
		int re2 = num3 <0 ? -num3 : num3;
		System.out.println("절대값 : " + (num3 < 0 ? -num3 : num3));
		
		// 둘다 똑같은 것
		
		
		System.out.println("------------------------------");
		
		
		// 문제1) 사용자로부터 점수를 입력받아서 80점 이상이라면 합격, 그렇지 않으면 불합격을 출력하시오.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요. : ");
		int a = scan.nextInt();
		
		System.out.println(a >= 80 ? "합격" : "불합격");
		
		/* 교수님 답지
		 * 
		 * String re3 = a>= 80 ? "합격" : "불합격";
		 * System.out.println(a);
		 * 
		 */
		
		// 90점 이상 A, 80점 이상 B, 70점이상 C 60점이상 D 그외 F학점을 맞게하세요.
		
		String b = a >= 90 ? "A" : (a >= 80 ? "B" : (a >= 70 ? "C" : (a >= 60 ? "D"  : "F" )));
		System.out.println(b);
		
		
		
		
	}

}
