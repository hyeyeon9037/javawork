package _02_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		/* 
		 int a = 1; <- while문 쓰기 전에 변수를 선언해야함 
		 while (조건식) {
		 조건식이 참일 때 수행
		 }
		
		*/
		
		for(int i=1; i<=3; i++) {
			System.out.println(i);
		}
		
		// 이 for문을 while문으로 바꾸려고하려면
		
		System.out.println("-------------------------------1");
		
		int i = 1;  //초기식
		while(i<=3) {	//조건식
			System.out.println(i);	//실행식
			i++; // 증감식
		}
		// 이렇게 바꿀 수 있음
		
		
		System.out.println("-------------------------------2");
		
		
		//for문을 while문으로 바꿔보세요
		
		int sum = 0;
		for(int j=1; j<=100; j++) {
			sum += j;
		}
		System.out.println("1~100까지의 합 : " + sum);
		
		
		System.out.println("-------------------------------3");
		
		sum = 0;
		int j = 1;
		while(j <=100) {
			sum += j;
			j++; // sum += j++; 로 줄일 수 있음
			
		}
		System.out.println("1~100까지의 합 : " + sum);
		
		
		System.out.println("-------------------------------4");
		
		
		int x = 10;
		while ( x != 0) {
			System.out.println(x);
			x--; // while ( x-- != 0 ) 으로 줄일 수 있음 ▶ --x 는 9 부터 시작 , x-- 는 10부터 시작임
			
			
		}
		
		System.out.println("-------------------------------5");
		
		int y = 10;
		while ( y--  != 0) {
			System.out.println(y);
				// 이러면 출력값이 9~0까지나옴
		}
		
		
		System.out.println("-------------------------------6");
		
		// break = 반복문을 빠져나온다
		int count = 0;
		while(true) {
			System.out.println(++count);
			if(count == 5) {
				break; // if문을 빠져나오는게 아니라 while문을 빠져나오라는 소리이다.
			}
		}	
			
			
		System.out.println("-------------------------------7");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("멈추려면 'q'를 넣으세요 : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'q')
				break;
		}
		System.out.println("프로그램이 종료되었습니다.");
			
		
		
		
	}

}
