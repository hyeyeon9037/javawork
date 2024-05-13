package _01_array;

import java.util.Arrays;

public class T04_min_max {

	public static void main(String[] args) {
		// 자리바꿈
		
		int num1 = 10;
		int num2 = 20;
		
		/*		
		num1 = num2; // 20
		num2 = num1; // 20
		
		*/
		
		int temp = num1;
		num2 = num1; // 10
		num2 = temp; // 10
			// 자리바꿈을 하려면 이렇게 하나의 변수를 선언한다!

		
		
		
		// 1차원 배열의 min 값과 max 값 가져오기
		
		int[] score = {8,4,9,2,6,1,3,5,7};
		
		int min = score[0];
		int max = score[0];
		/*
		min > score[1]
		min = score[1]
		*/
		
		for(int i =1; i<score.length; i++) {
		if(min>score[i]) 
			min = score[i]; // 8보다 작으면 그자리에 덮어씌우기를 하시오. 라는 뜻!
			
			if(max < score[i])
				max = score[i];
			
		}
		
		System.out.println("최솟값 : " + min);
		System.out.println("최댓값 : " + min);
		
		
		//index 번호 연산 가능
		int k = 2;
		System.out.println(score[k]); // 2번째 자리
		System.out.println(score[k+5]); // 7번재 자리
		System.out.println(score[k*3]); // 6번째 자리
		System.out.println(score[k-1]); // 1번째 자리
		
		
		int arri[] = new int[10];
		for (int i=0; i<arri.length; i++) {
			arri[i] = (int)(Math.random()*10);
			
		}
		
		for (int i=0; i<arri.length; i++) {
			System.out.print(arri[i] + ", ");
			
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arri));
		// Arrays 클래스 라이브러리(API)를 이용한 출력 ex) Byte, Integer, Double
		
	}
	
}
