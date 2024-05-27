package _02_repetitive;

public class _ex06 {

	public static void main(String[] args) {
		// 6 * 빈칸을 보고 규칙을 알아보자!

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) { // 빈칸 print
				System.out.print(" ");
			}

			for (int x = 0; x < i * 2 + 1; x++) { // 별찍는 print
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
