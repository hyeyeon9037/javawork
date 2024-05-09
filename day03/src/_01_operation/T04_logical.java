package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
		// 논리합과 논리곱
		/*
		 x y 논리곱(&&)  논리합(||)
		 0 0  	0		   0
		 0 1	0		   1
		 1 0  	0		   1 
		 1 1  	1		   1
		 
		 * 0 거짓 1 참
		 
		 논리합은 둘중에 하나가 거짓이면 거짓
		 논리곱은 둘중에 하나가 참이어도 참
		 
		 */
		
		int num1 = 10;
		int num2 = 20;
		boolean re1 = num1 > num2 && num1 <= num2;
		// 				f(0)	  &&	t(1) 
		System.out.println(re1); // false 가 나옴
		
		re1 = num1 > num2 || num1 <= num2;
		System.out.println(re1);
		System.out.println("------------------------------");
	
		
		
		// ! : not
		
		re1 = !re1;
		
		System.out.println(re1);
		boolean b1 = false;
		System.out.println(!b1);
		
		char ch = 'k'; // 유니코드 K : 75
		System.out.println(ch);
		System.out.println("소문자인가? : " + (ch >= 'a' && ch <= 'z') ); // 유니코드 : 97~122
		System.out.println("대문자인가? : " + (ch >= 'A' && ch <= 'Z') ); // 유니코드 : 65~90
		
		
		
		
		
		
	}

}
