package _01_array;

public class T01_1차원배열 {

	public static void main(String[] args) {
		// 배열[]
		
		int[] arrayInt = new int[100]; 
		int arrayInt1[] = new int[3];
		// int [] ~ 해도되고 int ~ [] 해도 된다.
		
		
		
		arrayInt[0] = 10;
		arrayInt[2] = 20;
		System.out.println(arrayInt[2]);
		
		int arrayInt2[] = {1, 2, 3, 4, 5 };
		
		char[] arrayChar = {'a', 'b', 'c'};
		String[] arrayStr = {"홍길동", "아무개"};
		double[] arryDou = {35.56, 89.34};
		
		int[] arrayInt3 = new int[5]; // index번호 : 0~4
		// arrayInt3[5] = 9; → index의 범위를 넘어서 오류가 뜸
		
		
		// ex) 배열 100개를 만들어서 1~100까지의 값을 넣는다.
		
		int[] arrayInt4 = new int[100];
		
		/* 한개씩 넣으면?
		arrayInt4[0] = 1;
		arrayInt4[1] = 2;
		arrayInt4[2] = 3;
		*/
		
		// 위에있는 건 규칙이 있으니 for문을 써보자.
		for(int i=0; i<100; i++) {
			arrayInt4[i] = i+1;
			System.out.print(arrayInt4[i] + "," );
		}
		
		
		
	}

}
