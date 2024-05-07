package _02_variable;

public class T01_var {

	public static void main(String[] args) {
		// 기본 자료형 : 문자1개(char)→유니코드사용, 정수(int), 실수 (double), 참, 거짓(boolean)
		
		// 정수 타입 : byte(1byte), char(2byte), short(2byte), int(4byte), long(8byte)
		
		int num1;
		// 자리만 만들어 놓음
		
		int num2 = 10;
		// num2에는 10이라는 숫자가 들어가있고, num1은 아무것도 들어가지 않은 것
		
		num1 = 11;
		// num1 에 11이라는 숫자를 넣은 것
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num1 + num2);
		System.out.println(num1 * 2 + num2);
		
		int sum = num1 + num2;
		System.out.println("num1+num2 = "+sum);
		
		
		
		// 문제1 ) 변수를 하나 만들어 sum + 5 를 한 결과를 넣으시오. 그리고 출력하시오.
		int num3 = sum +5;
		System.out.println(num3);
		
		
		long long1 = 500000000000000000L;
		double doub01 = 37.32414325;
		System.out.println(doub01);
		double doub02 = 78.8243;
		System.out.println(doub01+doub02);
		// double도 사칙연산 가능
		
		float float01 = 45.5462324f;
		System.out.println(float01);
		// 기본자료형 8byte를 float 4byte에 (큰 자료형을 작은 자료형에) 넣어서 오류가남 
		
		
		
	}

}
