package _02_repetitive;

public class _ex02 {

	public static void main(String[] args) {
		// 1~100까지 짝수, 홀수의 합을 각각 출력하시오
		
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if( i%2 == 0 ) {
				sum += i;

		}
		}
		System.out.println("짝수의 합계 : " + sum);
		
		int sum2 = 0;
		for (int i = 1; i<=100; i++) {
			if(i%2 != 0) {
				sum2 += i;
			}
		}
		
		System.out.println("홀수의 합계 : " + sum2);
		
	}

}
