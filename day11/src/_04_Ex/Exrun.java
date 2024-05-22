package _04_Ex;

import java.util.Scanner;

public class Exrun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100사이의 숫자를 적으세요");
			
	

		try {
			
			System.out.println("정수 1 : ");
			int a = sc.nextInt();
			
			System.out.println("정수 2 : ");
			int b = sc.nextInt();
			
			Ex E = new Ex();
			E.A(a, b);
			
		} catch(Exception e) {
			System.out.println("1~100사이의 숫자가 아닙니다");
		}
		
		
		
		
		}

	}


