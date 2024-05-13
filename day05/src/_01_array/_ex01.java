package _01_array;

public class _ex01 {

	public static void main(String[] args) {
		// 길이 10인 배열을 선언하고 1~10까지 반복문을 이용하여 순서대로 넣고 출력하기
		
		int[] a = new int [10];
		
		for(int i = 0; i<10; i++) {
			a[i] = i+1;

			System.out.print(a[i] + "," );
			
		}

	}

}
