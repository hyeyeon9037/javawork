package _01_array;

import java.util.Scanner;

public class _ex08 {

	public static void main(String[] args) {
		/*
		 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요. 
		
		   ex.
		   정수 : 4
		   다시 입력하세요.
		   정수 : -6
		   다시 입력하세요.
		   정수 : 5
		   1, 2, 3, 2, 1
		   정수 : 9
		   1, 2, 3, 4, 5, 4, 3, 2, 1
		   
		*/
		
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수를 입력하세요. : ");
			int num = scan.nextInt();
			if(num >= 3 && num%2==1 ) {
				int iarr[] = new int[num];
				
			int value = 1;
			
			for(int i=0; i<iarr.length; i++) {
				if(i<num/2)
					iarr[i] = value++;
				else
					iarr[i] = value--;
				
				if(i<iarr.length-1)
					System.out.print(iarr[i]+", "); // 맨끝 제외하고는 컴마"," 다 찍어
				else
					System.out.println(iarr[i]); // 맨끝에꺼는 컴마"," 찍지말아
				
			}
			break;
			
			} else {
				System.out.println("다시 입력하세요.");
			}
			
		}
		
		
		
		
	}

}
