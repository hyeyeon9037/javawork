package _01_conditional;

import java.util.Scanner;

public class T01_switch_case {

	public static void main(String[] args) {
		// switch-case
		
		int num1 = 2; // 0~2만 들어있는 변수로 가정해보자.
		
		switch(num1) { // switch() 괄호 안에 num1이나 2를 넣어도 된다.
		case 1:
			System.out.println("1입니다.");
			break;
			// case를 쓸 때에는 break 를 써야함 break를 쓰면 밑에 있는 괄호 밖으로 나가라는 소리.
		case 2:
			System.out.println("2입니다.");
			// 맨 끝에 case를 쓸때에는 break를 안써도 된다.
		} // 요기있는 괄호 밖으로 나감 (break)
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력(0~2 숫자만)");
		int num2 = sc.nextInt();
		
		switch(num2) {
		case 0:
			System.out.println("0입력함");
			break;
			
		case 1:
			System.out.println("1입력함");
			break;
			
		case 2:
			System.out.println("2입력함");
			break;
			
		default : // 위에있는 case 말고 나머지 전부 다를 의미
			System.out.println("잘못입력");
			
		}
		
		
		System.out.println("-------------------------------------------");
		
		
		char ch = 'k'; // k, l, p 만 들어온다고 가정해보고 시작해보자.
		switch(ch) {
		case 'k' :
			System.out.println("김씨입니다.");
			break;
			
		case 'l' :
			System.out.println("이씨입니다.");
			break;
			
		case 'p' : 
			System.out.println("박씨입니다.");
			break;
			
		default :
			System.out.println("성이 김, 이, 박씨가 아닙니다.");
			
		}
		
		
	
		System.out.println("-------------------------------------------");
		
		

		
		/*
		char ch = 'l'; // k, l, p 만 들어온다고 가정해보고 시작해보자.
		switch(ch) {
		case 'k' :
			System.out.println("김씨입니다.");
			
		case 'l' :
			System.out.println("이씨입니다.");
			
		case 'p' : 
			System.out.println("박씨입니다.");
	
		default :
			System.out.println("성이 김, 이, 박씨가 아닙니다.");
			
		}
		
		→ 이렇게 break; 를 쓰지 않고 하면 출력값은 이씨입니다, 박씨입니다가 나온다.
		
		*/
		
		System.out.println("-------------------------------------------");
		
		int month = 3;
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
			// 이런식으로 똑같은 결과 값이 나올때 다같이 case를 저렇게 쓰면 저 값을 쓸때, "겨울"이 나오게 출력해준다.
			
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			
			
		}

		
		

	}

}
