package _01_array;

import java.util.Arrays;

public class T06_향상된for문 {

	public static void main(String[] args) {
		// 향상된 for문 배열에서만 사용가능
		// 배열을 처음부터 끝까지 사용할 때 쓴다.
		
		int num[]= {1,2,3,4,5};
		
		for(int result: num) {
			System.out.println(result);
			
		}
		
		System.out.println("----------------------------");
		
		String name[] = {"홍길동", "아무개", "김길동"};
		for(String result : name) {
			System.out.println(result);
		}
		
		/*
			배열의 단점 : 배열의 크기가 많이 크면 넣을 값보다 크기 메모리가 낭비
	   			   	   배열의 크기가 적을 경우 나중에 늘릴 수가 없다.
					 
   배열의 크기가 적을 경우 : copy하여 만들어야한다.
   
		*/
	int [] oldScore = {98, 67, 48, 100, 94};
	int [] newScore = new int[10];
	
	for(int i=0; i<oldScore.length; i++) {
		newScore[i] = oldScore[i];
		
	}
		newScore[5] = 57;
		System.out.println(Arrays.toString(newScore));
		
		// 라이브러리(api) : arraycopy(복사할배열, 복사할 index번호, 새배열, 새배열의 index 번호( ~부터 넣기), 갯수)
		System.arraycopy(oldScore, 0, newScore, 6, 4); // 6번에서부터 4 개의 길이를 넣겠다라는 소리
		System.out.println(Arrays.toString(newScore));

		
		
		System.out.println("--------------------------------------");
		// 3개를 넣을 수 있는 문자열 배열을 만들어서 값을 넣고, 10개짜리의 배열을 만들어서 복사하여 넣기 (index 5번부터 2개만 넣기)
		
		String[] oldScore1 = { "밍", "망", "구"};
		String[] newScore1 = new String[10];
		
		System.arraycopy(oldScore1, 0, newScore1, 5, 2);
		System.out.println(Arrays.toString(newScore1));
		
		
		/* 위에를 for문 사용 하려면?
		for (int i =0; i<lodScore1.length-1; i++) {
		newScore1[i+5] = oldScore1[i];
		 }
		
		*/
		
		
		/*향상된 for문 사용

		System.out.println("--------------------------------------");
		
		int index =5;
		for (String str : oldScore1) {
			newScore1[index++] = str;
		}
		System.out.println(Arrays.toString(newScore1));
		*/
		
		
		
	}

}
