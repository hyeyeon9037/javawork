package _02_repetitive;

public class _ex01 {

	public static void main(String[] args) {
		// 1~100까지 5의 배수의 합을 출력하시오
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if ( i%5 == 0 ) {
				sum += i;
			}
		}
		System.out.println(" 5의 배수의 합 : " + sum );
	}

	
	
}
