package EX;

import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		/*
키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요. 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
  ex.
  이름 : 박신우
  학년(숫자만) : 3
  반(숫자만) : 4
  번호(숫자만) : 15
  성별(M/F) : F
  성적(소수점 아래 둘째자리까지) : 85.75

  3학년 4반 15번 박신우 여학생의 성적은 85.75이다.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scan.next();
		
		System.out.println("학년(숫자만) : ");
		int age = scan.nextInt();
	
		System.out.println("반(숫자만) : ");
		int ban = scan.nextInt();
		
		System.out.println("번호(숫자만) : ");
		int ho = scan.nextInt();
		
		System.out.println("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		
		String b = gender == 'M' ? "남학생" : "여학생";
		
		
		System.out.println("성적(소수점 아래 둘째자리까지) : ");
		double jak = scan.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", age, ban, ho, b, name, jak);
		
		
		
		
		// 다시하기 (이해완 !!)
		
	}

}

//틀림

