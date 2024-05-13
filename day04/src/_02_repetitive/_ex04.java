package _02_repetitive;

public class _ex04 {

	public static void main(String[] args) {
		// 이중 for 문을 이용하여 출력하시오
		/*
		 ex
		
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
