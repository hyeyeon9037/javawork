package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class _ex07 {

	public static void main(String[] args) {
		//사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고 배열 전체의 합 출력
		
	 // 어케하는거노 ?
					
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 개수 입력 : ");
		int count7 = scan.nextInt();
		
		int[] iarr7 = new int[count7];
		int sum = 0;
		
		for(int i=0; i<iarr7.length; i++) {
			System.out.print(i+1 + "번째 값 입력 : ");
			iarr7[i] = scan.nextInt();
			sum += iarr7[i];
		}

		System.out.println(Arrays.toString(iarr7));
		System.out.println("합계 : " + sum);
		System.out.println();
		
	}

}
