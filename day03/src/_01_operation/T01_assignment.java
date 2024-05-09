package _01_operation;

public class T01_assignment {

	public static void main(String[] args) {
		// % 값을 나눈 나머지
		
		int num1 = 10;
		int num2 = 3;
		int result = num1 % num2;
		
		System.out.println("몫 : "+ num1/num2);
		System.out.println("나머지 : " + result);
		
		num1 = num1 + 10;
		System.out.println(num1);
		// 기존에있는 num1 에 +10이 있으므로 num1은 20으로 덮어 씌어지는것
		
		num1 += 10; // num = num +10; 이란 소리. += 약자 외워두기 !
		System.out.println(num1);
		// 위에 있던 num이 20 이므로 +10 을 또 하면 30이 나옴
		
		num1 += 5;
		System.out.println(num1);
		// 30에서 +5 라서 35의 결과 값이 나온다.
	
		num1 -= 8;
		System.out.println(num1);
		// -도 가능 → 35-8=27
		
		num1 -= 17;
		System.out.println(num1);
		// 27-17=10
		
		num1 *= 3;
		System.out.println(num1);
		// 10*3=30
		
		num1 /= 3;
		System.out.println(num1);
		// 30/3 = 10
		
		num1 %= 4;
		System.out.println(num1);
		// 10/4 의 나머지값
		
		int num = 300_000_000; // 300,000,000 와 같은 역할 _은 사람이 보기 편하도록 하는 거
		System.out.println(num3);
		
	}

}
