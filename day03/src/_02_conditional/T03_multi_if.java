package _02_conditional;

import java.util.Scanner;

public class T03_multi_if {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();
		
		if(score>100)
			System.out.println("100점 이상은 넣을 수 없습니다");
		
		 else if(score >= 90) 
			System.out.println("A학점");
		 else if (score >= 80)
			System.out.println("B학점");
		 else if (score >= 70)
			 System.out.println("C학점");
		 else if (score >=60)
			 System.out.println("D학점");
		 else if (score > 0)
			 System.out.println("F학점");
		 else
			 System.out.println("점수는 음수가 될 수 없습니다.");
		
		// 논리 연산자를 안썼을 때 이렇게 씀
		
		/*
		 * 
		 if (score > 100 || score <0)
		System.out.println("점수를 잘못 입력하였습니다.");
		
		else if(score >= 90) 
			System.out.println("A학점");
		 else if (score >= 80)
			System.out.println("B학점");
		 else if (score >= 70)
			 System.out.println("C학점");
		 else if (score >=60)
			 System.out.println("D학점");
		 else 
			 System.out.println("F학점");
		*/
		
		// 논리 연산자를 썼을때 위와 같이 함
		// 논리연산자를 쓴게 더 좋음 이해 ㄱㄱ
		
		}

	}


