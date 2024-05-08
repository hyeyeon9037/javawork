package _01_casting;

public class T03_castingOp {

	public static void main(String[] args) {
		// chastingOp 클래스 이름
		// int형보다 작은 자료형의 연산은 모두 int로 자동 형변환 된다.
		
		byte b1 = 10;
		byte b2 = 20;
		
		//	byte result = b1 + b2; 오류남! → why? int형보다 작은 자료라 byte 로 불가능 ( byte형 ≠ int형 )
		int result = b1 + b2;
		byte result2 = (byte)(b1+b2); // 강제형 변환으로 하면 가능
		
		char c1 = 'a';
		// char c2 = c1 + 1;  오류남! → why? int형보다 작은 자료라 byte 로 불가능 ( byte형 ≠ int형 )
		int c3 = c1 + 1;
		char c2 = (char)(c1 + 1); 
		// 위와 같이 int형으로 자동변환으로 하거나 char형으로 나오게하려면 강제변환을 써야함.
		
		System.out.println(c2);
		System.out.println(c3);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1/num2;
		System.out.println(num1 + "/" + num2 + "의 몫 : " + result3 );
		
		double dou2 = 3;
		double result4 = num1 / dou2;
		System.out.println(result4);
		
		/*
		double = int / double
		double = double / int
		double = double / double
		자동 변환으로 double로 변함
		*/
		
		num1 = 100;
		num2 = 3;
		double re = (double)num1 / num2;
		re = num1/(double)num2;
		re = (double)num1 / (double)num2;
		
		double re2 = num1/num2; // double이라해도 소수점이 안나옴 num1,2 는 int형이라서 몫만 나옴.
		System.out.println(re2); // 그래서 결과값은 33.0 이나옴 <소수점이 나오게 하고싶으면 (double)num1 / num2 을 해야함.
		

		
		
	}

}
