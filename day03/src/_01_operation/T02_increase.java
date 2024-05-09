package _01_operation;

public class T02_increase {

	public static void main(String[] args) {
		// ++ 1증가를 의미
		
		int num1 = 10;
		
		num1 = num1 +1; // 11
		num1 += 1; // 12
		num1++; // 13
		// 다 같은 소리 + 1씩

		System.out.println(num1);
		
		num1 = 10; 
		// 10으로 다시 덮어 씌움
		num1--;
		System.out.println(num1);
		// 결과 : 9
		
		
		++num1;
		System.out.println(num1);
		// 결과 : 10
		
		--num1;
		System.out.println(num1);
		// 결과 : 9
		
		// 앞에 --,++ 하거나 뒤에 --,++ 하는건 똑같은 의미
		
		
		int num2 = 10;
		int num3 = 10;
		
		int result = ++num2 + ++num3;
		// 이항연산자일때는 연산자의 위치에 따라 결과가 달라짐
		// num2 = 11 , num3 = 11 ∴ 결과 값은 22
		
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = ++num2 + num3++;
		// 덮어씌우기
		// num2 = 11 , num3 = 10 ∴ 결과 값은 21 → why? num3++ 은 연산을 먼저하고난뒤 num3++(자기 숫자를 나중에)를 하기때문임. 

		num2 = 10;
		num3 = 10;
		// 덮어씌우기
		result = num2-- + num3--;
		System.out.println(result);
		// num2 = 10 , num3 = 10 ∴ 결과 값은 20 → why? 연산을 먼저하고 나중에 자기 숫자를 감소함 (위에랑 똑같은 이유)
		
		num2 = 10;
		num3 = 10;
		// 덮어씌우기
		int num4 = 10;
		
		result = ++num2 + num3-- - num4++; // 11
		System.out.println(result);
		
		
		
		
		
	}

}
